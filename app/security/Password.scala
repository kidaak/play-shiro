package security

import org.jasypt.digest._
import org.jasypt.digest.config._
import org.jasypt.util.password.{StrongPasswordEncryptor, PasswordEncryptor}
import org.mindrot.jbcrypt.BCrypt

/**
 * A password encryptor that passes through to the string digester on the backend.
 */
object Password
{
  def checkPassword(message: String, digest: String) = BCrypt.checkpw(message, digest)

  def encryptPassword(plaintext: String) = BCrypt.hashpw(plaintext, BCrypt.gensalt())
}

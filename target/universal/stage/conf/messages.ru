# Override default Play's validation messages

# --- Constraints
constraint.required=Required
constraint.min=Minimum value: {0}
constraint.max=Maximum value: {0}
constraint.minLength=Minimum length: {0}
constraint.maxLength=Maximum length: {0}
constraint.email=Email

# --- Formats
format.date=Date (''{0}'')
format.numeric=Numeric
format.real=Real

# --- Errors
error.invalid=Invalid value
error.required=This field is required
error.number=Numeric value expected
error.real=Real number value expected
error.min=Must be greater or equal to {0}
error.max=Must be less or equal to {0}
error.minLength=Minimum length is {0}
error.maxLength=Maximum length is {0}
error.email=Valid email required
error.pattern=Must satisfy {0}

### --- play-authenticate START

# play-authenticate: Initial translations

playauthenticate.accounts.link.success=Account linked successfully
playauthenticate.accounts.merge.success=Accounts merged successfully

playauthenticate.verify_email.error.already_validated=Your e-mail has already been validated.
playauthenticate.verify_email.error.set_email_first=You need to set an e-mail address first.
playauthenticate.verify_email.message.instructions_sent=Instructions on how to verify your e-mail address have been sent to {0}.
playauthenticate.verify_email.success=E-mail address ({0}) successfully verified.

playauthenticate.reset_password.message.instructions_sent=Instructions on how to reset your password have been sent to {0}.
playauthenticate.reset_password.message.email_not_verified=Your account has not been verified, yet. An e-mail including instructions on how to verify it has been sent out. Retry resetting your password afterwards.
playauthenticate.reset_password.message.no_password_account=Your user has not yet been set up for password usage.
playauthenticate.reset_password.message.success.auto_login=Your password has been reset.
playauthenticate.reset_password.message.success.manual_login=Your password has been reset. Please now log in using your new password.

playauthenticate.change_password.error.passwords_not_same=Passwords do not match.
playauthenticate.change_password.success=Password has been changed successfully.

playauthenticate.password.signup.error.passwords_not_same=Passwords do not match.
playauthenticate.password.login.unknown_user_or_pw=Unknown user or password.

playauthenticate.password.verify_signup.subject=PlayAuthenticate: Complete your signup
playauthenticate.password.verify_email.subject=PlayAuthenticate: Confirm your e-mail address
playauthenticate.password.reset_email.subject=PlayAuthenticate: How to reset your password

# play-authenticate: Additional translations

playauthenticate.login.email.placeholder=Your e-mail address
playauthenticate.login.password.placeholder=Choose a password
playauthenticate.login.password.repeat=Repeat chosen password
playauthenticate.login.title=Регистрация
playauthenticate.login.password.placeholder=Password
playauthenticate.login.now=Войти
playauthenticate.login.forgot.password=Forgot your password?
playauthenticate.login.oauth=Зарегистрируйтесь, используя свой аккаунт в одной из социальных сетей:
playauthenticate.login.basic=or try HTTP basic auth (as example/secret)

playauthenticate.signup.title=Регистрация на сайте
playauthenticate.signup.name=Ваше имя
playauthenticate.signup.now=Sign up now
playauthenticate.signup.oauth=Зарегистрируйтесь, используя свой аккаунт в одной из социальных сетей:

playauthenticate.verify.account.title=E-mail verification required
playauthenticate.verify.account.before=Before setting a password, you need to
playauthenticate.verify.account.first=first verify your e-mail address

playauthenticate.change.password.title=Change your password here
playauthenticate.change.password.cta=Change my password

playauthenticate.merge.accounts.title=Merge accounts
playauthenticate.merge.accounts.question=Do you want to merge your current account ({0}) with this account: {1}?
playauthenticate.merge.accounts.true=Yes, merge these two accounts
playauthenticate.merge.accounts.false=No, exit my current session and log in as a new user
playauthenticate.merge.accounts.ok=OK

playauthenticate.link.account.title=Привязать аккаунты
playauthenticate.link.account.question=Привязать ({0}) к Вашему профилю?
playauthenticate.link.account.true=Да, привязать этот аккаунт!
playauthenticate.link.account.false=Нет, выйти и создать нового пользователя с этим аккаунтом!
playauthenticate.link.account.ok=OK

# play-authenticate: Signup folder translations

playauthenticate.verify.email.title=Verify your e-mail
playauthenticate.verify.email.requirement=Before you can use PlayAuthenticate, you first need to verify your e-mail address.
playauthenticate.verify.email.cta=An e-mail has been sent to the registered address. Please follow the embedded link to activate your account.

playauthenticate.password.reset.title=Reset password
playauthenticate.password.reset.cta=Reset my password

playauthenticate.password.forgot.title=Forgot password
playauthenticate.password.forgot.cta=Send reset instructions

playauthenticate.oauth.access.denied.title=OAuth access denied
playauthenticate.oauth.access.denied.explanation=If you want to use PlayAuthenticate with OAuth, you must accept the connection.
playauthenticate.oauth.access.denied.alternative=If you rather not like to do this, you can also
playauthenticate.oauth.access.denied.alternative.cta=sign up with a username and password instead

playauthenticate.token.error.title=Token error
playauthenticate.token.error.message=The given token has either expired or does not exist.

playauthenticate.user.exists.title=User exists
playauthenticate.user.exists.message=This user already exists.

# play-authenticate: Navigation
playauthenticate.navigation.profile=Профиль
playauthenticate.navigation.link_more=Привязать еще аккаунты
playauthenticate.navigation.logout=Выйти
playauthenticate.navigation.login=Войти
playauthenticate.navigation.home=Главная
playauthenticate.navigation.restricted=Restricted page
playauthenticate.navigation.signup=Зарегистрироваться

# play-authenticate: Handler
playauthenticate.handler.loginfirst=You need to log in first, to view ''{0}''

# play-authenticate: Profile
playauthenticate.profile.title=Профиль пользователя
playauthenticate.profile.mail=Ваше имя is {0} И Ваш email: {1}!
playauthenticate.profile.unverified=unverified - click to verify
playauthenticate.profile.verified=verified
playauthenticate.profile.providers_many=There are {0} providers linked with your account:
playauthenticate.profile.providers_one = C Вашим аккаунтом связан один аккунт социальной сети:
playauthenticate.profile.logged=Вы зарегистрированы через Ваш аккаунт:
playauthenticate.profile.session=Your user ID is {0} and your session will expire on {1}
playauthenticate.profile.session_endless=Your user ID is {0} and your session will not expire, as it is endless
playauthenticate.profile.password_change=Change/set a password for your account

# play-authenticate - sample: Index page
playauthenticate.index.title=Кинологический центр "Симаргл"
playauthenticate.index.intro=Play Authenticate sample app
playauthenticate.index.intro_2=This is a template for a simple application with authentication.
playauthenticate.index.intro_3=Check the main navigation above for simple page examples including supported authentication features.
playauthenticate.index.heading=Heading
playauthenticate.index.details=Детали
playauthenticate.index.weite=Далее

playauthenticate.posts.text=Текст
playauthenticate.posts.title=Тема
playauthenticate.posts.prev=Кратко
playauthenticate.posts.CreateNewBlogPost_as=Создать новый пост как

# play-authenticate - sample: Restricted page
playauthenticate.restricted.secrets=Secrets, everywhere!

### --- play-authenticate END
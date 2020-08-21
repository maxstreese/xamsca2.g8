# Repo Seed Scala

## Description

The [Giter8](http://www.foundweekends.org/giter8/) template I use for bootstrapping basic Scala repositories/projects.
As this template is for my personal use it is tailored to whatever repository structure and Scala style I happen to
be using. That being said if someone finds this repository helpful feel free to utilize it in whichever way you like
(also see the [license](license)).

There are one or two things I would like to note about this repository:
* The usage of a dependency bot in the form of [Renovate](https://github.com/renovatebot/renovate), which helps to keep
  everything as up-to-date as possible. Configuration is not yet perfect for every kind of dependency this repository
  has but most dependencies are tracked by the bot. There are two notable alternatives to Renovate for Scala
  repositories:
  * [Dependabot](https://dependabot.com/) which seems to be far and away the most popular dependency bot. I prefer
    Renovate over it because if you have to you can run it self-managed which we do at my workplace and which can
    be required if you need access to e.g. non-public artifact repositories.
  * [Scala Steward](https://github.com/scala-steward-org/scala-steward) which is a dependency bot specific to Scala
    and SBT repositories. You can run Scala Steward self-managed but I prefer Renovate for two reasons: (1) I have
    found it to be much more performant and easy to set up and (2) It is much more general in that it can provide
    updates for not just Scala/SBT dependencies but for most languages and build tools out there with a unified
    configuration and vocabulary.
* The configuration of [Gitpod](https://www.gitpod.io/) for the created repository. Gitpod is a development environment
  that runs in the cloud and with which you can interact via your browser. What this means is if you host your
  repository on e.g. [Github](https://github.com/) anyone with a free account can start development on that repository
  without having to set up a local development environment specific to the repository first. Please note that at this
  point the configuration I have put in place for Gitpod is not yet ideal and while the cloud environment works there
  are things that need improvement.

## Usage

With the Giter8 command line tool:
```bash
g8 maxstreese/repo-seed-scala.g8
```

With SBT:
```bash
sbt new maxstreese/repo-seed-scala.g8
```






<!DOCTYPE html>
<html class="   ">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    
    <title>JSON-java/JSONObject.java at master · douglascrockford/JSON-java</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="douglascrockford/JSON-java" name="twitter:title" /><meta content="JSON-java - A reference implementation of a JSON package in Java." name="twitter:description" /><meta content="https://avatars0.githubusercontent.com/u/262641?s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars0.githubusercontent.com/u/262641?s=400" property="og:image" /><meta content="douglascrockford/JSON-java" property="og:title" /><meta content="https://github.com/douglascrockford/JSON-java" property="og:url" /><meta content="JSON-java - A reference implementation of a JSON package in Java." property="og:description" />

    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035">
    <link rel="xhr-socket" href="/_sockets" />

    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
      <meta name="google-analytics" content="UA-3769691-2">

    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="18DACEC9:4015:7A5032F:53A8DD65" name="octolytics-dimension-request_id" /><meta content="1551615" name="octolytics-actor-id" /><meta content="bigmacmccoy" name="octolytics-actor-login" /><meta content="74097fa7f03ef65e999eb97a400f88380c087a3d67e8e84a8a0792f52307487a" name="octolytics-actor-hash" />
    

    
    
    <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico" />


    <meta content="authenticity_token" name="csrf-param" />
<meta content="nvQ4oy1NzAxR9YIalkvOJdIePMzSgvKi7js4/TVQXNDDd/Rv4JlWQ0sXuo0oRYZ4AXtT2G9o4SSY9hKjJFx9xw==" name="csrf-token" />

    <link href="https://assets-cdn.github.com/assets/github-38e184196414b8b76b95e8a86f017df0f46ae71e.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://assets-cdn.github.com/assets/github2-56a4b5fe77cda9c841a8bc19ebf8edd02bb3b0ea.css" media="all" rel="stylesheet" type="text/css" />
    


    <meta http-equiv="x-pjax-version" content="b6052cc0aafadbf8a42a64c495c3d258">

      
  <meta name="description" content="JSON-java - A reference implementation of a JSON package in Java." />


  <meta content="262641" name="octolytics-dimension-user_id" /><meta content="douglascrockford" name="octolytics-dimension-user_login" /><meta content="1187853" name="octolytics-dimension-repository_id" /><meta content="douglascrockford/JSON-java" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="1187853" name="octolytics-dimension-repository_network_root_id" /><meta content="douglascrockford/JSON-java" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/douglascrockford/JSON-java/commits/master.atom" rel="alternate" title="Recent Commits to JSON-java:master" type="application/atom+xml" />

  </head>


  <body class="logged_in  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" aria-label="Homepage">
  <span class="mega-octicon octicon-mark-github"></span>
</a>


    
    <a href="/notifications" aria-label="You have no unread notifications" class="notification-indicator tooltipped tooltipped-s" data-hotkey="g n">
        <span class="mail-status all-read"></span>
</a>

      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<div class="commandbar">
  <span class="message"></span>
  <input type="text" data-hotkey="s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    data-username="bigmacmccoy"
      data-repo="douglascrockford/JSON-java"
      data-branch="master"
      data-sha="63f7d61506f4e1cdea5a08098ed45c3f75f26236"
  >
  <div class="display hidden"></div>
</div>

    <input type="hidden" name="nwo" value="douglascrockford/JSON-java" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    


  <ul id="user-links">
    <li>
      <a href="/bigmacmccoy" class="name">
        <img alt="Braedon Big Mac McCoy" class=" js-avatar" data-user="1551615" height="20" src="https://avatars0.githubusercontent.com/u/1551615?s=140" width="20" /> bigmacmccoy
      </a>
    </li>

    <li class="new-menu dropdown-toggle js-menu-container">
      <a href="#" class="js-menu-target tooltipped tooltipped-s" aria-label="Create new...">
        <span class="octicon octicon-plus"></span>
        <span class="dropdown-arrow"></span>
      </a>

      <div class="new-menu-content js-menu-content">
      </div>
    </li>

    <li>
      <a href="/settings/profile" id="account_settings"
        class="tooltipped tooltipped-s"
        aria-label="Account settings ">
        <span class="octicon octicon-tools"></span>
      </a>
    </li>
    <li>
      <form class="logout-form" action="/logout" method="post">
        <button class="sign-out-button tooltipped tooltipped-s" aria-label="Sign out">
          <span class="octicon octicon-sign-out"></span>
        </button>
      </form>
    </li>

  </ul>

<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


</ul>

</div>


    
  </div>
</div>

      

        



      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    <div id="js-flash-container">
      
    </div>
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="bSmUqK+xvoM5k3HKgr7+PCpg63TxDFBjXrI8h2FZGN2FFBQt+4ZGgAUVYU7NFKydlRVcGrkxG/GcEUwi9GRDkA==" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="1187853" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/douglascrockford/JSON-java/watchers">
        157
      </a>
      <span class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true">
        <span class="js-select-button">
          <span class="octicon octicon-eye"></span>
          Watch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-x js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for conversations in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
    

  <div class="js-toggler-container js-social-container starring-container ">

    <form accept-charset="UTF-8" action="/douglascrockford/JSON-java/unstar" class="js-toggler-form starred" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="4ngKsBZMANWEeBGRG9opKMRMTKzrYn+WB9jC6RByI9tgxL88m3XrPVT9jCLhZz8fuai1Nhvlq1yvF5WGXSji/w==" /></div>
      <button
        class="minibutton with-count js-toggler-target star-button"
        aria-label="Unstar this repository" title="Unstar douglascrockford/JSON-java">
        <span class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/douglascrockford/JSON-java/stargazers">
          1,135
        </a>
</form>
    <form accept-charset="UTF-8" action="/douglascrockford/JSON-java/star" class="js-toggler-form unstarred" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="VqlrQRe/eQhgeHj7b4AeabLx6HwTzLqPVTMaYYnfFM7WVxj04OXHBJG6aRq5z9HIyBcSqPYVL1vYb4Dwlh+wWw==" /></div>
      <button
        class="minibutton with-count js-toggler-target star-button"
        aria-label="Star this repository" title="Star douglascrockford/JSON-java">
        <span class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/douglascrockford/JSON-java/stargazers">
          1,135
        </a>
</form>  </div>

  </li>


        <li>
          <a href="/douglascrockford/JSON-java/fork" class="minibutton with-count js-toggler-target fork-button lighter tooltipped-n" title="Fork your own copy of douglascrockford/JSON-java to your account" aria-label="Fork your own copy of douglascrockford/JSON-java to your account" rel="facebox nofollow">
            <span class="octicon octicon-repo-forked"></span>
            Fork
          </a>
          <a href="/douglascrockford/JSON-java/network" class="social-count">1,123</a>
        </li>

</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo"></span>
          <span class="author"><a href="/douglascrockford" class="url fn" itemprop="url" rel="author"><span itemprop="title">douglascrockford</span></a></span><!--
       --><span class="path-divider">/</span><!--
       --><strong><a href="/douglascrockford/JSON-java" class="js-current-repository js-repo-home-link">JSON-java</a></strong>

          <span class="page-context-loader">
            <img alt="" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/douglascrockford/JSON-java" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-hotkey="g c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /douglascrockford/JSON-java">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/douglascrockford/JSON-java/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-hotkey="g p" data-selected-links="repo_pulls /douglascrockford/JSON-java/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>3</span>
            <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/douglascrockford/JSON-java/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-hotkey="g w" data-selected-links="repo_wiki /douglascrockford/JSON-java/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/douglascrockford/JSON-java/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /douglascrockford/JSON-java/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/douglascrockford/JSON-java/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /douglascrockford/JSON-java/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/douglascrockford/JSON-java/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /douglascrockford/JSON-java/network">
          <span class="octicon octicon-repo-forked"></span> <span class="full-word">Network</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/douglascrockford/JSON-java.git" readonly="readonly">
    <span class="url-box-clippy">
    <button aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="https://github.com/douglascrockford/JSON-java.git" data-copied-hint="copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone">
  <h3><strong>SSH</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="git@github.com:douglascrockford/JSON-java.git" readonly="readonly">
    <span class="url-box-clippy">
    <button aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="git@github.com:douglascrockford/JSON-java.git" data-copied-hint="copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/douglascrockford/JSON-java" readonly="readonly">
    <span class="url-box-clippy">
    <button aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="https://github.com/douglascrockford/JSON-java" data-copied-hint="copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <a href="https://help.github.com/articles/which-remote-url-should-i-use" class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <span class="octicon octicon-question"></span>
  </a>
</p>


  <a href="github-windows://openRepo/https://github.com/douglascrockford/JSON-java" class="minibutton sidebar-button" title="Save douglascrockford/JSON-java to your computer and use it in GitHub Desktop." aria-label="Save douglascrockford/JSON-java to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/douglascrockford/JSON-java/archive/master.zip"
                   class="minibutton sidebar-button"
                   aria-label="Download douglascrockford/JSON-java as a zip file"
                   title="Download douglascrockford/JSON-java as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<a href="/douglascrockford/JSON-java/blob/8114b976ce7224ff3b89f3d7e53f4207b7dcdf4f/JSONObject.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:28ea63ccccd4fa7fe77f932c7a5be0b5 -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target css-truncate" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    title="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button css-truncate-target">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-x js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/douglascrockford/JSON-java/blob/master/JSONObject.java"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="button-group right">
    <a href="/douglascrockford/JSON-java/find/master"
          class="js-show-file-finder minibutton empty-icon tooltipped tooltipped-s"
          data-pjax
          data-hotkey="t"
          aria-label="Quickly jump between files">
      <span class="octicon octicon-list-unordered"></span>
    </a>
    <button class="js-zeroclipboard minibutton zeroclipboard-button"
          data-clipboard-text="JSONObject.java"
          aria-label="Copy to clipboard"
          data-copied-hint="Copied!">
      <span class="octicon octicon-clippy"></span>
    </button>
  </div>

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/douglascrockford/JSON-java" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">JSON-java</span></a></span></span><span class="separator"> / </span><strong class="final-path">JSONObject.java</strong>
  </div>
</div>


  <div class="commit file-history-tease">
      <img alt="Douglas Crockford" class="main-avatar js-avatar" data-user="262641" height="24" src="https://avatars3.githubusercontent.com/u/262641?s=140" width="24" />
      <span class="author"><a href="/douglascrockford" rel="author">douglascrockford</a></span>
      <time datetime="2014-05-05T15:09:32-07:00" is="relative-time">May 05, 2014</time>
      <div class="commit-title">
          <a href="/douglascrockford/JSON-java/commit/a9a07623834b6da2c2c3d47b440e002dedfd9e17" class="message" data-pjax="true" title="Java 1.8.">Java 1.8.</a>
      </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>2</strong>  contributors</a></p>
          <a class="avatar tooltipped tooltipped-s" aria-label="douglascrockford" href="/douglascrockford/JSON-java/commits/master/JSONObject.java?author=douglascrockford"><img alt="Douglas Crockford" class=" js-avatar" data-user="262641" height="20" src="https://avatars3.githubusercontent.com/u/262641?s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="ajayk" href="/douglascrockford/JSON-java/commits/master/JSONObject.java?author=ajayk"><img alt="Ajay Kemparaj" class=" js-avatar" data-user="1015125" height="20" src="https://avatars2.githubusercontent.com/u/1015125?s=140" width="20" /></a>


    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="Douglas Crockford" class=" js-avatar" data-user="262641" height="24" src="https://avatars3.githubusercontent.com/u/262641?s=140" width="24" />
            <a href="/douglascrockford">douglascrockford</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Ajay Kemparaj" class=" js-avatar" data-user="1015125" height="24" src="https://avatars2.githubusercontent.com/u/1015125?s=140" width="24" />
            <a href="/ajayk">ajayk</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">executable file</span>
        <span class="meta-divider"></span>
          <span>1684 lines (1581 sloc)</span>
          <span class="meta-divider"></span>
        <span>57.494 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w"
               href="github-windows://openRepo/https://github.com/douglascrockford/JSON-java?branch=master&amp;filepath=JSONObject.java" aria-label="Open this file in GitHub for Windows">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
                <a class="minibutton tooltipped tooltipped-n js-update-url-with-hash"
                   aria-label="Clicking this button will automatically fork this project so you can edit the file"
                   href="/douglascrockford/JSON-java/edit/master/JSONObject.java"
                   data-method="post" rel="nofollow">Edit</a>
          <a href="/douglascrockford/JSON-java/raw/master/JSONObject.java" class="minibutton " id="raw-url">Raw</a>
            <a href="/douglascrockford/JSON-java/blame/master/JSONObject.java" class="minibutton js-update-url-with-hash">Blame</a>
          <a href="/douglascrockford/JSON-java/commits/master/JSONObject.java" class="minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->

            <a class="minibutton danger empty-icon tooltipped tooltipped-s"
               href="/douglascrockford/JSON-java/delete/master/JSONObject.java"
               aria-label="Fork this project and delete file"
               data-method="post" data-test-id="delete-blob-file" rel="nofollow">

          Delete
        </a>
      </div><!-- /.actions -->
    </div>
      
  <div class="blob-wrapper data type-java js-blob-data">
       <table class="file-code file-diff tab-size-8">
         <tr class="file-code-line">
           <td class="blob-line-nums">
             <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>
<span id="L197" rel="#L197">197</span>
<span id="L198" rel="#L198">198</span>
<span id="L199" rel="#L199">199</span>
<span id="L200" rel="#L200">200</span>
<span id="L201" rel="#L201">201</span>
<span id="L202" rel="#L202">202</span>
<span id="L203" rel="#L203">203</span>
<span id="L204" rel="#L204">204</span>
<span id="L205" rel="#L205">205</span>
<span id="L206" rel="#L206">206</span>
<span id="L207" rel="#L207">207</span>
<span id="L208" rel="#L208">208</span>
<span id="L209" rel="#L209">209</span>
<span id="L210" rel="#L210">210</span>
<span id="L211" rel="#L211">211</span>
<span id="L212" rel="#L212">212</span>
<span id="L213" rel="#L213">213</span>
<span id="L214" rel="#L214">214</span>
<span id="L215" rel="#L215">215</span>
<span id="L216" rel="#L216">216</span>
<span id="L217" rel="#L217">217</span>
<span id="L218" rel="#L218">218</span>
<span id="L219" rel="#L219">219</span>
<span id="L220" rel="#L220">220</span>
<span id="L221" rel="#L221">221</span>
<span id="L222" rel="#L222">222</span>
<span id="L223" rel="#L223">223</span>
<span id="L224" rel="#L224">224</span>
<span id="L225" rel="#L225">225</span>
<span id="L226" rel="#L226">226</span>
<span id="L227" rel="#L227">227</span>
<span id="L228" rel="#L228">228</span>
<span id="L229" rel="#L229">229</span>
<span id="L230" rel="#L230">230</span>
<span id="L231" rel="#L231">231</span>
<span id="L232" rel="#L232">232</span>
<span id="L233" rel="#L233">233</span>
<span id="L234" rel="#L234">234</span>
<span id="L235" rel="#L235">235</span>
<span id="L236" rel="#L236">236</span>
<span id="L237" rel="#L237">237</span>
<span id="L238" rel="#L238">238</span>
<span id="L239" rel="#L239">239</span>
<span id="L240" rel="#L240">240</span>
<span id="L241" rel="#L241">241</span>
<span id="L242" rel="#L242">242</span>
<span id="L243" rel="#L243">243</span>
<span id="L244" rel="#L244">244</span>
<span id="L245" rel="#L245">245</span>
<span id="L246" rel="#L246">246</span>
<span id="L247" rel="#L247">247</span>
<span id="L248" rel="#L248">248</span>
<span id="L249" rel="#L249">249</span>
<span id="L250" rel="#L250">250</span>
<span id="L251" rel="#L251">251</span>
<span id="L252" rel="#L252">252</span>
<span id="L253" rel="#L253">253</span>
<span id="L254" rel="#L254">254</span>
<span id="L255" rel="#L255">255</span>
<span id="L256" rel="#L256">256</span>
<span id="L257" rel="#L257">257</span>
<span id="L258" rel="#L258">258</span>
<span id="L259" rel="#L259">259</span>
<span id="L260" rel="#L260">260</span>
<span id="L261" rel="#L261">261</span>
<span id="L262" rel="#L262">262</span>
<span id="L263" rel="#L263">263</span>
<span id="L264" rel="#L264">264</span>
<span id="L265" rel="#L265">265</span>
<span id="L266" rel="#L266">266</span>
<span id="L267" rel="#L267">267</span>
<span id="L268" rel="#L268">268</span>
<span id="L269" rel="#L269">269</span>
<span id="L270" rel="#L270">270</span>
<span id="L271" rel="#L271">271</span>
<span id="L272" rel="#L272">272</span>
<span id="L273" rel="#L273">273</span>
<span id="L274" rel="#L274">274</span>
<span id="L275" rel="#L275">275</span>
<span id="L276" rel="#L276">276</span>
<span id="L277" rel="#L277">277</span>
<span id="L278" rel="#L278">278</span>
<span id="L279" rel="#L279">279</span>
<span id="L280" rel="#L280">280</span>
<span id="L281" rel="#L281">281</span>
<span id="L282" rel="#L282">282</span>
<span id="L283" rel="#L283">283</span>
<span id="L284" rel="#L284">284</span>
<span id="L285" rel="#L285">285</span>
<span id="L286" rel="#L286">286</span>
<span id="L287" rel="#L287">287</span>
<span id="L288" rel="#L288">288</span>
<span id="L289" rel="#L289">289</span>
<span id="L290" rel="#L290">290</span>
<span id="L291" rel="#L291">291</span>
<span id="L292" rel="#L292">292</span>
<span id="L293" rel="#L293">293</span>
<span id="L294" rel="#L294">294</span>
<span id="L295" rel="#L295">295</span>
<span id="L296" rel="#L296">296</span>
<span id="L297" rel="#L297">297</span>
<span id="L298" rel="#L298">298</span>
<span id="L299" rel="#L299">299</span>
<span id="L300" rel="#L300">300</span>
<span id="L301" rel="#L301">301</span>
<span id="L302" rel="#L302">302</span>
<span id="L303" rel="#L303">303</span>
<span id="L304" rel="#L304">304</span>
<span id="L305" rel="#L305">305</span>
<span id="L306" rel="#L306">306</span>
<span id="L307" rel="#L307">307</span>
<span id="L308" rel="#L308">308</span>
<span id="L309" rel="#L309">309</span>
<span id="L310" rel="#L310">310</span>
<span id="L311" rel="#L311">311</span>
<span id="L312" rel="#L312">312</span>
<span id="L313" rel="#L313">313</span>
<span id="L314" rel="#L314">314</span>
<span id="L315" rel="#L315">315</span>
<span id="L316" rel="#L316">316</span>
<span id="L317" rel="#L317">317</span>
<span id="L318" rel="#L318">318</span>
<span id="L319" rel="#L319">319</span>
<span id="L320" rel="#L320">320</span>
<span id="L321" rel="#L321">321</span>
<span id="L322" rel="#L322">322</span>
<span id="L323" rel="#L323">323</span>
<span id="L324" rel="#L324">324</span>
<span id="L325" rel="#L325">325</span>
<span id="L326" rel="#L326">326</span>
<span id="L327" rel="#L327">327</span>
<span id="L328" rel="#L328">328</span>
<span id="L329" rel="#L329">329</span>
<span id="L330" rel="#L330">330</span>
<span id="L331" rel="#L331">331</span>
<span id="L332" rel="#L332">332</span>
<span id="L333" rel="#L333">333</span>
<span id="L334" rel="#L334">334</span>
<span id="L335" rel="#L335">335</span>
<span id="L336" rel="#L336">336</span>
<span id="L337" rel="#L337">337</span>
<span id="L338" rel="#L338">338</span>
<span id="L339" rel="#L339">339</span>
<span id="L340" rel="#L340">340</span>
<span id="L341" rel="#L341">341</span>
<span id="L342" rel="#L342">342</span>
<span id="L343" rel="#L343">343</span>
<span id="L344" rel="#L344">344</span>
<span id="L345" rel="#L345">345</span>
<span id="L346" rel="#L346">346</span>
<span id="L347" rel="#L347">347</span>
<span id="L348" rel="#L348">348</span>
<span id="L349" rel="#L349">349</span>
<span id="L350" rel="#L350">350</span>
<span id="L351" rel="#L351">351</span>
<span id="L352" rel="#L352">352</span>
<span id="L353" rel="#L353">353</span>
<span id="L354" rel="#L354">354</span>
<span id="L355" rel="#L355">355</span>
<span id="L356" rel="#L356">356</span>
<span id="L357" rel="#L357">357</span>
<span id="L358" rel="#L358">358</span>
<span id="L359" rel="#L359">359</span>
<span id="L360" rel="#L360">360</span>
<span id="L361" rel="#L361">361</span>
<span id="L362" rel="#L362">362</span>
<span id="L363" rel="#L363">363</span>
<span id="L364" rel="#L364">364</span>
<span id="L365" rel="#L365">365</span>
<span id="L366" rel="#L366">366</span>
<span id="L367" rel="#L367">367</span>
<span id="L368" rel="#L368">368</span>
<span id="L369" rel="#L369">369</span>
<span id="L370" rel="#L370">370</span>
<span id="L371" rel="#L371">371</span>
<span id="L372" rel="#L372">372</span>
<span id="L373" rel="#L373">373</span>
<span id="L374" rel="#L374">374</span>
<span id="L375" rel="#L375">375</span>
<span id="L376" rel="#L376">376</span>
<span id="L377" rel="#L377">377</span>
<span id="L378" rel="#L378">378</span>
<span id="L379" rel="#L379">379</span>
<span id="L380" rel="#L380">380</span>
<span id="L381" rel="#L381">381</span>
<span id="L382" rel="#L382">382</span>
<span id="L383" rel="#L383">383</span>
<span id="L384" rel="#L384">384</span>
<span id="L385" rel="#L385">385</span>
<span id="L386" rel="#L386">386</span>
<span id="L387" rel="#L387">387</span>
<span id="L388" rel="#L388">388</span>
<span id="L389" rel="#L389">389</span>
<span id="L390" rel="#L390">390</span>
<span id="L391" rel="#L391">391</span>
<span id="L392" rel="#L392">392</span>
<span id="L393" rel="#L393">393</span>
<span id="L394" rel="#L394">394</span>
<span id="L395" rel="#L395">395</span>
<span id="L396" rel="#L396">396</span>
<span id="L397" rel="#L397">397</span>
<span id="L398" rel="#L398">398</span>
<span id="L399" rel="#L399">399</span>
<span id="L400" rel="#L400">400</span>
<span id="L401" rel="#L401">401</span>
<span id="L402" rel="#L402">402</span>
<span id="L403" rel="#L403">403</span>
<span id="L404" rel="#L404">404</span>
<span id="L405" rel="#L405">405</span>
<span id="L406" rel="#L406">406</span>
<span id="L407" rel="#L407">407</span>
<span id="L408" rel="#L408">408</span>
<span id="L409" rel="#L409">409</span>
<span id="L410" rel="#L410">410</span>
<span id="L411" rel="#L411">411</span>
<span id="L412" rel="#L412">412</span>
<span id="L413" rel="#L413">413</span>
<span id="L414" rel="#L414">414</span>
<span id="L415" rel="#L415">415</span>
<span id="L416" rel="#L416">416</span>
<span id="L417" rel="#L417">417</span>
<span id="L418" rel="#L418">418</span>
<span id="L419" rel="#L419">419</span>
<span id="L420" rel="#L420">420</span>
<span id="L421" rel="#L421">421</span>
<span id="L422" rel="#L422">422</span>
<span id="L423" rel="#L423">423</span>
<span id="L424" rel="#L424">424</span>
<span id="L425" rel="#L425">425</span>
<span id="L426" rel="#L426">426</span>
<span id="L427" rel="#L427">427</span>
<span id="L428" rel="#L428">428</span>
<span id="L429" rel="#L429">429</span>
<span id="L430" rel="#L430">430</span>
<span id="L431" rel="#L431">431</span>
<span id="L432" rel="#L432">432</span>
<span id="L433" rel="#L433">433</span>
<span id="L434" rel="#L434">434</span>
<span id="L435" rel="#L435">435</span>
<span id="L436" rel="#L436">436</span>
<span id="L437" rel="#L437">437</span>
<span id="L438" rel="#L438">438</span>
<span id="L439" rel="#L439">439</span>
<span id="L440" rel="#L440">440</span>
<span id="L441" rel="#L441">441</span>
<span id="L442" rel="#L442">442</span>
<span id="L443" rel="#L443">443</span>
<span id="L444" rel="#L444">444</span>
<span id="L445" rel="#L445">445</span>
<span id="L446" rel="#L446">446</span>
<span id="L447" rel="#L447">447</span>
<span id="L448" rel="#L448">448</span>
<span id="L449" rel="#L449">449</span>
<span id="L450" rel="#L450">450</span>
<span id="L451" rel="#L451">451</span>
<span id="L452" rel="#L452">452</span>
<span id="L453" rel="#L453">453</span>
<span id="L454" rel="#L454">454</span>
<span id="L455" rel="#L455">455</span>
<span id="L456" rel="#L456">456</span>
<span id="L457" rel="#L457">457</span>
<span id="L458" rel="#L458">458</span>
<span id="L459" rel="#L459">459</span>
<span id="L460" rel="#L460">460</span>
<span id="L461" rel="#L461">461</span>
<span id="L462" rel="#L462">462</span>
<span id="L463" rel="#L463">463</span>
<span id="L464" rel="#L464">464</span>
<span id="L465" rel="#L465">465</span>
<span id="L466" rel="#L466">466</span>
<span id="L467" rel="#L467">467</span>
<span id="L468" rel="#L468">468</span>
<span id="L469" rel="#L469">469</span>
<span id="L470" rel="#L470">470</span>
<span id="L471" rel="#L471">471</span>
<span id="L472" rel="#L472">472</span>
<span id="L473" rel="#L473">473</span>
<span id="L474" rel="#L474">474</span>
<span id="L475" rel="#L475">475</span>
<span id="L476" rel="#L476">476</span>
<span id="L477" rel="#L477">477</span>
<span id="L478" rel="#L478">478</span>
<span id="L479" rel="#L479">479</span>
<span id="L480" rel="#L480">480</span>
<span id="L481" rel="#L481">481</span>
<span id="L482" rel="#L482">482</span>
<span id="L483" rel="#L483">483</span>
<span id="L484" rel="#L484">484</span>
<span id="L485" rel="#L485">485</span>
<span id="L486" rel="#L486">486</span>
<span id="L487" rel="#L487">487</span>
<span id="L488" rel="#L488">488</span>
<span id="L489" rel="#L489">489</span>
<span id="L490" rel="#L490">490</span>
<span id="L491" rel="#L491">491</span>
<span id="L492" rel="#L492">492</span>
<span id="L493" rel="#L493">493</span>
<span id="L494" rel="#L494">494</span>
<span id="L495" rel="#L495">495</span>
<span id="L496" rel="#L496">496</span>
<span id="L497" rel="#L497">497</span>
<span id="L498" rel="#L498">498</span>
<span id="L499" rel="#L499">499</span>
<span id="L500" rel="#L500">500</span>
<span id="L501" rel="#L501">501</span>
<span id="L502" rel="#L502">502</span>
<span id="L503" rel="#L503">503</span>
<span id="L504" rel="#L504">504</span>
<span id="L505" rel="#L505">505</span>
<span id="L506" rel="#L506">506</span>
<span id="L507" rel="#L507">507</span>
<span id="L508" rel="#L508">508</span>
<span id="L509" rel="#L509">509</span>
<span id="L510" rel="#L510">510</span>
<span id="L511" rel="#L511">511</span>
<span id="L512" rel="#L512">512</span>
<span id="L513" rel="#L513">513</span>
<span id="L514" rel="#L514">514</span>
<span id="L515" rel="#L515">515</span>
<span id="L516" rel="#L516">516</span>
<span id="L517" rel="#L517">517</span>
<span id="L518" rel="#L518">518</span>
<span id="L519" rel="#L519">519</span>
<span id="L520" rel="#L520">520</span>
<span id="L521" rel="#L521">521</span>
<span id="L522" rel="#L522">522</span>
<span id="L523" rel="#L523">523</span>
<span id="L524" rel="#L524">524</span>
<span id="L525" rel="#L525">525</span>
<span id="L526" rel="#L526">526</span>
<span id="L527" rel="#L527">527</span>
<span id="L528" rel="#L528">528</span>
<span id="L529" rel="#L529">529</span>
<span id="L530" rel="#L530">530</span>
<span id="L531" rel="#L531">531</span>
<span id="L532" rel="#L532">532</span>
<span id="L533" rel="#L533">533</span>
<span id="L534" rel="#L534">534</span>
<span id="L535" rel="#L535">535</span>
<span id="L536" rel="#L536">536</span>
<span id="L537" rel="#L537">537</span>
<span id="L538" rel="#L538">538</span>
<span id="L539" rel="#L539">539</span>
<span id="L540" rel="#L540">540</span>
<span id="L541" rel="#L541">541</span>
<span id="L542" rel="#L542">542</span>
<span id="L543" rel="#L543">543</span>
<span id="L544" rel="#L544">544</span>
<span id="L545" rel="#L545">545</span>
<span id="L546" rel="#L546">546</span>
<span id="L547" rel="#L547">547</span>
<span id="L548" rel="#L548">548</span>
<span id="L549" rel="#L549">549</span>
<span id="L550" rel="#L550">550</span>
<span id="L551" rel="#L551">551</span>
<span id="L552" rel="#L552">552</span>
<span id="L553" rel="#L553">553</span>
<span id="L554" rel="#L554">554</span>
<span id="L555" rel="#L555">555</span>
<span id="L556" rel="#L556">556</span>
<span id="L557" rel="#L557">557</span>
<span id="L558" rel="#L558">558</span>
<span id="L559" rel="#L559">559</span>
<span id="L560" rel="#L560">560</span>
<span id="L561" rel="#L561">561</span>
<span id="L562" rel="#L562">562</span>
<span id="L563" rel="#L563">563</span>
<span id="L564" rel="#L564">564</span>
<span id="L565" rel="#L565">565</span>
<span id="L566" rel="#L566">566</span>
<span id="L567" rel="#L567">567</span>
<span id="L568" rel="#L568">568</span>
<span id="L569" rel="#L569">569</span>
<span id="L570" rel="#L570">570</span>
<span id="L571" rel="#L571">571</span>
<span id="L572" rel="#L572">572</span>
<span id="L573" rel="#L573">573</span>
<span id="L574" rel="#L574">574</span>
<span id="L575" rel="#L575">575</span>
<span id="L576" rel="#L576">576</span>
<span id="L577" rel="#L577">577</span>
<span id="L578" rel="#L578">578</span>
<span id="L579" rel="#L579">579</span>
<span id="L580" rel="#L580">580</span>
<span id="L581" rel="#L581">581</span>
<span id="L582" rel="#L582">582</span>
<span id="L583" rel="#L583">583</span>
<span id="L584" rel="#L584">584</span>
<span id="L585" rel="#L585">585</span>
<span id="L586" rel="#L586">586</span>
<span id="L587" rel="#L587">587</span>
<span id="L588" rel="#L588">588</span>
<span id="L589" rel="#L589">589</span>
<span id="L590" rel="#L590">590</span>
<span id="L591" rel="#L591">591</span>
<span id="L592" rel="#L592">592</span>
<span id="L593" rel="#L593">593</span>
<span id="L594" rel="#L594">594</span>
<span id="L595" rel="#L595">595</span>
<span id="L596" rel="#L596">596</span>
<span id="L597" rel="#L597">597</span>
<span id="L598" rel="#L598">598</span>
<span id="L599" rel="#L599">599</span>
<span id="L600" rel="#L600">600</span>
<span id="L601" rel="#L601">601</span>
<span id="L602" rel="#L602">602</span>
<span id="L603" rel="#L603">603</span>
<span id="L604" rel="#L604">604</span>
<span id="L605" rel="#L605">605</span>
<span id="L606" rel="#L606">606</span>
<span id="L607" rel="#L607">607</span>
<span id="L608" rel="#L608">608</span>
<span id="L609" rel="#L609">609</span>
<span id="L610" rel="#L610">610</span>
<span id="L611" rel="#L611">611</span>
<span id="L612" rel="#L612">612</span>
<span id="L613" rel="#L613">613</span>
<span id="L614" rel="#L614">614</span>
<span id="L615" rel="#L615">615</span>
<span id="L616" rel="#L616">616</span>
<span id="L617" rel="#L617">617</span>
<span id="L618" rel="#L618">618</span>
<span id="L619" rel="#L619">619</span>
<span id="L620" rel="#L620">620</span>
<span id="L621" rel="#L621">621</span>
<span id="L622" rel="#L622">622</span>
<span id="L623" rel="#L623">623</span>
<span id="L624" rel="#L624">624</span>
<span id="L625" rel="#L625">625</span>
<span id="L626" rel="#L626">626</span>
<span id="L627" rel="#L627">627</span>
<span id="L628" rel="#L628">628</span>
<span id="L629" rel="#L629">629</span>
<span id="L630" rel="#L630">630</span>
<span id="L631" rel="#L631">631</span>
<span id="L632" rel="#L632">632</span>
<span id="L633" rel="#L633">633</span>
<span id="L634" rel="#L634">634</span>
<span id="L635" rel="#L635">635</span>
<span id="L636" rel="#L636">636</span>
<span id="L637" rel="#L637">637</span>
<span id="L638" rel="#L638">638</span>
<span id="L639" rel="#L639">639</span>
<span id="L640" rel="#L640">640</span>
<span id="L641" rel="#L641">641</span>
<span id="L642" rel="#L642">642</span>
<span id="L643" rel="#L643">643</span>
<span id="L644" rel="#L644">644</span>
<span id="L645" rel="#L645">645</span>
<span id="L646" rel="#L646">646</span>
<span id="L647" rel="#L647">647</span>
<span id="L648" rel="#L648">648</span>
<span id="L649" rel="#L649">649</span>
<span id="L650" rel="#L650">650</span>
<span id="L651" rel="#L651">651</span>
<span id="L652" rel="#L652">652</span>
<span id="L653" rel="#L653">653</span>
<span id="L654" rel="#L654">654</span>
<span id="L655" rel="#L655">655</span>
<span id="L656" rel="#L656">656</span>
<span id="L657" rel="#L657">657</span>
<span id="L658" rel="#L658">658</span>
<span id="L659" rel="#L659">659</span>
<span id="L660" rel="#L660">660</span>
<span id="L661" rel="#L661">661</span>
<span id="L662" rel="#L662">662</span>
<span id="L663" rel="#L663">663</span>
<span id="L664" rel="#L664">664</span>
<span id="L665" rel="#L665">665</span>
<span id="L666" rel="#L666">666</span>
<span id="L667" rel="#L667">667</span>
<span id="L668" rel="#L668">668</span>
<span id="L669" rel="#L669">669</span>
<span id="L670" rel="#L670">670</span>
<span id="L671" rel="#L671">671</span>
<span id="L672" rel="#L672">672</span>
<span id="L673" rel="#L673">673</span>
<span id="L674" rel="#L674">674</span>
<span id="L675" rel="#L675">675</span>
<span id="L676" rel="#L676">676</span>
<span id="L677" rel="#L677">677</span>
<span id="L678" rel="#L678">678</span>
<span id="L679" rel="#L679">679</span>
<span id="L680" rel="#L680">680</span>
<span id="L681" rel="#L681">681</span>
<span id="L682" rel="#L682">682</span>
<span id="L683" rel="#L683">683</span>
<span id="L684" rel="#L684">684</span>
<span id="L685" rel="#L685">685</span>
<span id="L686" rel="#L686">686</span>
<span id="L687" rel="#L687">687</span>
<span id="L688" rel="#L688">688</span>
<span id="L689" rel="#L689">689</span>
<span id="L690" rel="#L690">690</span>
<span id="L691" rel="#L691">691</span>
<span id="L692" rel="#L692">692</span>
<span id="L693" rel="#L693">693</span>
<span id="L694" rel="#L694">694</span>
<span id="L695" rel="#L695">695</span>
<span id="L696" rel="#L696">696</span>
<span id="L697" rel="#L697">697</span>
<span id="L698" rel="#L698">698</span>
<span id="L699" rel="#L699">699</span>
<span id="L700" rel="#L700">700</span>
<span id="L701" rel="#L701">701</span>
<span id="L702" rel="#L702">702</span>
<span id="L703" rel="#L703">703</span>
<span id="L704" rel="#L704">704</span>
<span id="L705" rel="#L705">705</span>
<span id="L706" rel="#L706">706</span>
<span id="L707" rel="#L707">707</span>
<span id="L708" rel="#L708">708</span>
<span id="L709" rel="#L709">709</span>
<span id="L710" rel="#L710">710</span>
<span id="L711" rel="#L711">711</span>
<span id="L712" rel="#L712">712</span>
<span id="L713" rel="#L713">713</span>
<span id="L714" rel="#L714">714</span>
<span id="L715" rel="#L715">715</span>
<span id="L716" rel="#L716">716</span>
<span id="L717" rel="#L717">717</span>
<span id="L718" rel="#L718">718</span>
<span id="L719" rel="#L719">719</span>
<span id="L720" rel="#L720">720</span>
<span id="L721" rel="#L721">721</span>
<span id="L722" rel="#L722">722</span>
<span id="L723" rel="#L723">723</span>
<span id="L724" rel="#L724">724</span>
<span id="L725" rel="#L725">725</span>
<span id="L726" rel="#L726">726</span>
<span id="L727" rel="#L727">727</span>
<span id="L728" rel="#L728">728</span>
<span id="L729" rel="#L729">729</span>
<span id="L730" rel="#L730">730</span>
<span id="L731" rel="#L731">731</span>
<span id="L732" rel="#L732">732</span>
<span id="L733" rel="#L733">733</span>
<span id="L734" rel="#L734">734</span>
<span id="L735" rel="#L735">735</span>
<span id="L736" rel="#L736">736</span>
<span id="L737" rel="#L737">737</span>
<span id="L738" rel="#L738">738</span>
<span id="L739" rel="#L739">739</span>
<span id="L740" rel="#L740">740</span>
<span id="L741" rel="#L741">741</span>
<span id="L742" rel="#L742">742</span>
<span id="L743" rel="#L743">743</span>
<span id="L744" rel="#L744">744</span>
<span id="L745" rel="#L745">745</span>
<span id="L746" rel="#L746">746</span>
<span id="L747" rel="#L747">747</span>
<span id="L748" rel="#L748">748</span>
<span id="L749" rel="#L749">749</span>
<span id="L750" rel="#L750">750</span>
<span id="L751" rel="#L751">751</span>
<span id="L752" rel="#L752">752</span>
<span id="L753" rel="#L753">753</span>
<span id="L754" rel="#L754">754</span>
<span id="L755" rel="#L755">755</span>
<span id="L756" rel="#L756">756</span>
<span id="L757" rel="#L757">757</span>
<span id="L758" rel="#L758">758</span>
<span id="L759" rel="#L759">759</span>
<span id="L760" rel="#L760">760</span>
<span id="L761" rel="#L761">761</span>
<span id="L762" rel="#L762">762</span>
<span id="L763" rel="#L763">763</span>
<span id="L764" rel="#L764">764</span>
<span id="L765" rel="#L765">765</span>
<span id="L766" rel="#L766">766</span>
<span id="L767" rel="#L767">767</span>
<span id="L768" rel="#L768">768</span>
<span id="L769" rel="#L769">769</span>
<span id="L770" rel="#L770">770</span>
<span id="L771" rel="#L771">771</span>
<span id="L772" rel="#L772">772</span>
<span id="L773" rel="#L773">773</span>
<span id="L774" rel="#L774">774</span>
<span id="L775" rel="#L775">775</span>
<span id="L776" rel="#L776">776</span>
<span id="L777" rel="#L777">777</span>
<span id="L778" rel="#L778">778</span>
<span id="L779" rel="#L779">779</span>
<span id="L780" rel="#L780">780</span>
<span id="L781" rel="#L781">781</span>
<span id="L782" rel="#L782">782</span>
<span id="L783" rel="#L783">783</span>
<span id="L784" rel="#L784">784</span>
<span id="L785" rel="#L785">785</span>
<span id="L786" rel="#L786">786</span>
<span id="L787" rel="#L787">787</span>
<span id="L788" rel="#L788">788</span>
<span id="L789" rel="#L789">789</span>
<span id="L790" rel="#L790">790</span>
<span id="L791" rel="#L791">791</span>
<span id="L792" rel="#L792">792</span>
<span id="L793" rel="#L793">793</span>
<span id="L794" rel="#L794">794</span>
<span id="L795" rel="#L795">795</span>
<span id="L796" rel="#L796">796</span>
<span id="L797" rel="#L797">797</span>
<span id="L798" rel="#L798">798</span>
<span id="L799" rel="#L799">799</span>
<span id="L800" rel="#L800">800</span>
<span id="L801" rel="#L801">801</span>
<span id="L802" rel="#L802">802</span>
<span id="L803" rel="#L803">803</span>
<span id="L804" rel="#L804">804</span>
<span id="L805" rel="#L805">805</span>
<span id="L806" rel="#L806">806</span>
<span id="L807" rel="#L807">807</span>
<span id="L808" rel="#L808">808</span>
<span id="L809" rel="#L809">809</span>
<span id="L810" rel="#L810">810</span>
<span id="L811" rel="#L811">811</span>
<span id="L812" rel="#L812">812</span>
<span id="L813" rel="#L813">813</span>
<span id="L814" rel="#L814">814</span>
<span id="L815" rel="#L815">815</span>
<span id="L816" rel="#L816">816</span>
<span id="L817" rel="#L817">817</span>
<span id="L818" rel="#L818">818</span>
<span id="L819" rel="#L819">819</span>
<span id="L820" rel="#L820">820</span>
<span id="L821" rel="#L821">821</span>
<span id="L822" rel="#L822">822</span>
<span id="L823" rel="#L823">823</span>
<span id="L824" rel="#L824">824</span>
<span id="L825" rel="#L825">825</span>
<span id="L826" rel="#L826">826</span>
<span id="L827" rel="#L827">827</span>
<span id="L828" rel="#L828">828</span>
<span id="L829" rel="#L829">829</span>
<span id="L830" rel="#L830">830</span>
<span id="L831" rel="#L831">831</span>
<span id="L832" rel="#L832">832</span>
<span id="L833" rel="#L833">833</span>
<span id="L834" rel="#L834">834</span>
<span id="L835" rel="#L835">835</span>
<span id="L836" rel="#L836">836</span>
<span id="L837" rel="#L837">837</span>
<span id="L838" rel="#L838">838</span>
<span id="L839" rel="#L839">839</span>
<span id="L840" rel="#L840">840</span>
<span id="L841" rel="#L841">841</span>
<span id="L842" rel="#L842">842</span>
<span id="L843" rel="#L843">843</span>
<span id="L844" rel="#L844">844</span>
<span id="L845" rel="#L845">845</span>
<span id="L846" rel="#L846">846</span>
<span id="L847" rel="#L847">847</span>
<span id="L848" rel="#L848">848</span>
<span id="L849" rel="#L849">849</span>
<span id="L850" rel="#L850">850</span>
<span id="L851" rel="#L851">851</span>
<span id="L852" rel="#L852">852</span>
<span id="L853" rel="#L853">853</span>
<span id="L854" rel="#L854">854</span>
<span id="L855" rel="#L855">855</span>
<span id="L856" rel="#L856">856</span>
<span id="L857" rel="#L857">857</span>
<span id="L858" rel="#L858">858</span>
<span id="L859" rel="#L859">859</span>
<span id="L860" rel="#L860">860</span>
<span id="L861" rel="#L861">861</span>
<span id="L862" rel="#L862">862</span>
<span id="L863" rel="#L863">863</span>
<span id="L864" rel="#L864">864</span>
<span id="L865" rel="#L865">865</span>
<span id="L866" rel="#L866">866</span>
<span id="L867" rel="#L867">867</span>
<span id="L868" rel="#L868">868</span>
<span id="L869" rel="#L869">869</span>
<span id="L870" rel="#L870">870</span>
<span id="L871" rel="#L871">871</span>
<span id="L872" rel="#L872">872</span>
<span id="L873" rel="#L873">873</span>
<span id="L874" rel="#L874">874</span>
<span id="L875" rel="#L875">875</span>
<span id="L876" rel="#L876">876</span>
<span id="L877" rel="#L877">877</span>
<span id="L878" rel="#L878">878</span>
<span id="L879" rel="#L879">879</span>
<span id="L880" rel="#L880">880</span>
<span id="L881" rel="#L881">881</span>
<span id="L882" rel="#L882">882</span>
<span id="L883" rel="#L883">883</span>
<span id="L884" rel="#L884">884</span>
<span id="L885" rel="#L885">885</span>
<span id="L886" rel="#L886">886</span>
<span id="L887" rel="#L887">887</span>
<span id="L888" rel="#L888">888</span>
<span id="L889" rel="#L889">889</span>
<span id="L890" rel="#L890">890</span>
<span id="L891" rel="#L891">891</span>
<span id="L892" rel="#L892">892</span>
<span id="L893" rel="#L893">893</span>
<span id="L894" rel="#L894">894</span>
<span id="L895" rel="#L895">895</span>
<span id="L896" rel="#L896">896</span>
<span id="L897" rel="#L897">897</span>
<span id="L898" rel="#L898">898</span>
<span id="L899" rel="#L899">899</span>
<span id="L900" rel="#L900">900</span>
<span id="L901" rel="#L901">901</span>
<span id="L902" rel="#L902">902</span>
<span id="L903" rel="#L903">903</span>
<span id="L904" rel="#L904">904</span>
<span id="L905" rel="#L905">905</span>
<span id="L906" rel="#L906">906</span>
<span id="L907" rel="#L907">907</span>
<span id="L908" rel="#L908">908</span>
<span id="L909" rel="#L909">909</span>
<span id="L910" rel="#L910">910</span>
<span id="L911" rel="#L911">911</span>
<span id="L912" rel="#L912">912</span>
<span id="L913" rel="#L913">913</span>
<span id="L914" rel="#L914">914</span>
<span id="L915" rel="#L915">915</span>
<span id="L916" rel="#L916">916</span>
<span id="L917" rel="#L917">917</span>
<span id="L918" rel="#L918">918</span>
<span id="L919" rel="#L919">919</span>
<span id="L920" rel="#L920">920</span>
<span id="L921" rel="#L921">921</span>
<span id="L922" rel="#L922">922</span>
<span id="L923" rel="#L923">923</span>
<span id="L924" rel="#L924">924</span>
<span id="L925" rel="#L925">925</span>
<span id="L926" rel="#L926">926</span>
<span id="L927" rel="#L927">927</span>
<span id="L928" rel="#L928">928</span>
<span id="L929" rel="#L929">929</span>
<span id="L930" rel="#L930">930</span>
<span id="L931" rel="#L931">931</span>
<span id="L932" rel="#L932">932</span>
<span id="L933" rel="#L933">933</span>
<span id="L934" rel="#L934">934</span>
<span id="L935" rel="#L935">935</span>
<span id="L936" rel="#L936">936</span>
<span id="L937" rel="#L937">937</span>
<span id="L938" rel="#L938">938</span>
<span id="L939" rel="#L939">939</span>
<span id="L940" rel="#L940">940</span>
<span id="L941" rel="#L941">941</span>
<span id="L942" rel="#L942">942</span>
<span id="L943" rel="#L943">943</span>
<span id="L944" rel="#L944">944</span>
<span id="L945" rel="#L945">945</span>
<span id="L946" rel="#L946">946</span>
<span id="L947" rel="#L947">947</span>
<span id="L948" rel="#L948">948</span>
<span id="L949" rel="#L949">949</span>
<span id="L950" rel="#L950">950</span>
<span id="L951" rel="#L951">951</span>
<span id="L952" rel="#L952">952</span>
<span id="L953" rel="#L953">953</span>
<span id="L954" rel="#L954">954</span>
<span id="L955" rel="#L955">955</span>
<span id="L956" rel="#L956">956</span>
<span id="L957" rel="#L957">957</span>
<span id="L958" rel="#L958">958</span>
<span id="L959" rel="#L959">959</span>
<span id="L960" rel="#L960">960</span>
<span id="L961" rel="#L961">961</span>
<span id="L962" rel="#L962">962</span>
<span id="L963" rel="#L963">963</span>
<span id="L964" rel="#L964">964</span>
<span id="L965" rel="#L965">965</span>
<span id="L966" rel="#L966">966</span>
<span id="L967" rel="#L967">967</span>
<span id="L968" rel="#L968">968</span>
<span id="L969" rel="#L969">969</span>
<span id="L970" rel="#L970">970</span>
<span id="L971" rel="#L971">971</span>
<span id="L972" rel="#L972">972</span>
<span id="L973" rel="#L973">973</span>
<span id="L974" rel="#L974">974</span>
<span id="L975" rel="#L975">975</span>
<span id="L976" rel="#L976">976</span>
<span id="L977" rel="#L977">977</span>
<span id="L978" rel="#L978">978</span>
<span id="L979" rel="#L979">979</span>
<span id="L980" rel="#L980">980</span>
<span id="L981" rel="#L981">981</span>
<span id="L982" rel="#L982">982</span>
<span id="L983" rel="#L983">983</span>
<span id="L984" rel="#L984">984</span>
<span id="L985" rel="#L985">985</span>
<span id="L986" rel="#L986">986</span>
<span id="L987" rel="#L987">987</span>
<span id="L988" rel="#L988">988</span>
<span id="L989" rel="#L989">989</span>
<span id="L990" rel="#L990">990</span>
<span id="L991" rel="#L991">991</span>
<span id="L992" rel="#L992">992</span>
<span id="L993" rel="#L993">993</span>
<span id="L994" rel="#L994">994</span>
<span id="L995" rel="#L995">995</span>
<span id="L996" rel="#L996">996</span>
<span id="L997" rel="#L997">997</span>
<span id="L998" rel="#L998">998</span>
<span id="L999" rel="#L999">999</span>
<span id="L1000" rel="#L1000">1000</span>
<span id="L1001" rel="#L1001">1001</span>
<span id="L1002" rel="#L1002">1002</span>
<span id="L1003" rel="#L1003">1003</span>
<span id="L1004" rel="#L1004">1004</span>
<span id="L1005" rel="#L1005">1005</span>
<span id="L1006" rel="#L1006">1006</span>
<span id="L1007" rel="#L1007">1007</span>
<span id="L1008" rel="#L1008">1008</span>
<span id="L1009" rel="#L1009">1009</span>
<span id="L1010" rel="#L1010">1010</span>
<span id="L1011" rel="#L1011">1011</span>
<span id="L1012" rel="#L1012">1012</span>
<span id="L1013" rel="#L1013">1013</span>
<span id="L1014" rel="#L1014">1014</span>
<span id="L1015" rel="#L1015">1015</span>
<span id="L1016" rel="#L1016">1016</span>
<span id="L1017" rel="#L1017">1017</span>
<span id="L1018" rel="#L1018">1018</span>
<span id="L1019" rel="#L1019">1019</span>
<span id="L1020" rel="#L1020">1020</span>
<span id="L1021" rel="#L1021">1021</span>
<span id="L1022" rel="#L1022">1022</span>
<span id="L1023" rel="#L1023">1023</span>
<span id="L1024" rel="#L1024">1024</span>
<span id="L1025" rel="#L1025">1025</span>
<span id="L1026" rel="#L1026">1026</span>
<span id="L1027" rel="#L1027">1027</span>
<span id="L1028" rel="#L1028">1028</span>
<span id="L1029" rel="#L1029">1029</span>
<span id="L1030" rel="#L1030">1030</span>
<span id="L1031" rel="#L1031">1031</span>
<span id="L1032" rel="#L1032">1032</span>
<span id="L1033" rel="#L1033">1033</span>
<span id="L1034" rel="#L1034">1034</span>
<span id="L1035" rel="#L1035">1035</span>
<span id="L1036" rel="#L1036">1036</span>
<span id="L1037" rel="#L1037">1037</span>
<span id="L1038" rel="#L1038">1038</span>
<span id="L1039" rel="#L1039">1039</span>
<span id="L1040" rel="#L1040">1040</span>
<span id="L1041" rel="#L1041">1041</span>
<span id="L1042" rel="#L1042">1042</span>
<span id="L1043" rel="#L1043">1043</span>
<span id="L1044" rel="#L1044">1044</span>
<span id="L1045" rel="#L1045">1045</span>
<span id="L1046" rel="#L1046">1046</span>
<span id="L1047" rel="#L1047">1047</span>
<span id="L1048" rel="#L1048">1048</span>
<span id="L1049" rel="#L1049">1049</span>
<span id="L1050" rel="#L1050">1050</span>
<span id="L1051" rel="#L1051">1051</span>
<span id="L1052" rel="#L1052">1052</span>
<span id="L1053" rel="#L1053">1053</span>
<span id="L1054" rel="#L1054">1054</span>
<span id="L1055" rel="#L1055">1055</span>
<span id="L1056" rel="#L1056">1056</span>
<span id="L1057" rel="#L1057">1057</span>
<span id="L1058" rel="#L1058">1058</span>
<span id="L1059" rel="#L1059">1059</span>
<span id="L1060" rel="#L1060">1060</span>
<span id="L1061" rel="#L1061">1061</span>
<span id="L1062" rel="#L1062">1062</span>
<span id="L1063" rel="#L1063">1063</span>
<span id="L1064" rel="#L1064">1064</span>
<span id="L1065" rel="#L1065">1065</span>
<span id="L1066" rel="#L1066">1066</span>
<span id="L1067" rel="#L1067">1067</span>
<span id="L1068" rel="#L1068">1068</span>
<span id="L1069" rel="#L1069">1069</span>
<span id="L1070" rel="#L1070">1070</span>
<span id="L1071" rel="#L1071">1071</span>
<span id="L1072" rel="#L1072">1072</span>
<span id="L1073" rel="#L1073">1073</span>
<span id="L1074" rel="#L1074">1074</span>
<span id="L1075" rel="#L1075">1075</span>
<span id="L1076" rel="#L1076">1076</span>
<span id="L1077" rel="#L1077">1077</span>
<span id="L1078" rel="#L1078">1078</span>
<span id="L1079" rel="#L1079">1079</span>
<span id="L1080" rel="#L1080">1080</span>
<span id="L1081" rel="#L1081">1081</span>
<span id="L1082" rel="#L1082">1082</span>
<span id="L1083" rel="#L1083">1083</span>
<span id="L1084" rel="#L1084">1084</span>
<span id="L1085" rel="#L1085">1085</span>
<span id="L1086" rel="#L1086">1086</span>
<span id="L1087" rel="#L1087">1087</span>
<span id="L1088" rel="#L1088">1088</span>
<span id="L1089" rel="#L1089">1089</span>
<span id="L1090" rel="#L1090">1090</span>
<span id="L1091" rel="#L1091">1091</span>
<span id="L1092" rel="#L1092">1092</span>
<span id="L1093" rel="#L1093">1093</span>
<span id="L1094" rel="#L1094">1094</span>
<span id="L1095" rel="#L1095">1095</span>
<span id="L1096" rel="#L1096">1096</span>
<span id="L1097" rel="#L1097">1097</span>
<span id="L1098" rel="#L1098">1098</span>
<span id="L1099" rel="#L1099">1099</span>
<span id="L1100" rel="#L1100">1100</span>
<span id="L1101" rel="#L1101">1101</span>
<span id="L1102" rel="#L1102">1102</span>
<span id="L1103" rel="#L1103">1103</span>
<span id="L1104" rel="#L1104">1104</span>
<span id="L1105" rel="#L1105">1105</span>
<span id="L1106" rel="#L1106">1106</span>
<span id="L1107" rel="#L1107">1107</span>
<span id="L1108" rel="#L1108">1108</span>
<span id="L1109" rel="#L1109">1109</span>
<span id="L1110" rel="#L1110">1110</span>
<span id="L1111" rel="#L1111">1111</span>
<span id="L1112" rel="#L1112">1112</span>
<span id="L1113" rel="#L1113">1113</span>
<span id="L1114" rel="#L1114">1114</span>
<span id="L1115" rel="#L1115">1115</span>
<span id="L1116" rel="#L1116">1116</span>
<span id="L1117" rel="#L1117">1117</span>
<span id="L1118" rel="#L1118">1118</span>
<span id="L1119" rel="#L1119">1119</span>
<span id="L1120" rel="#L1120">1120</span>
<span id="L1121" rel="#L1121">1121</span>
<span id="L1122" rel="#L1122">1122</span>
<span id="L1123" rel="#L1123">1123</span>
<span id="L1124" rel="#L1124">1124</span>
<span id="L1125" rel="#L1125">1125</span>
<span id="L1126" rel="#L1126">1126</span>
<span id="L1127" rel="#L1127">1127</span>
<span id="L1128" rel="#L1128">1128</span>
<span id="L1129" rel="#L1129">1129</span>
<span id="L1130" rel="#L1130">1130</span>
<span id="L1131" rel="#L1131">1131</span>
<span id="L1132" rel="#L1132">1132</span>
<span id="L1133" rel="#L1133">1133</span>
<span id="L1134" rel="#L1134">1134</span>
<span id="L1135" rel="#L1135">1135</span>
<span id="L1136" rel="#L1136">1136</span>
<span id="L1137" rel="#L1137">1137</span>
<span id="L1138" rel="#L1138">1138</span>
<span id="L1139" rel="#L1139">1139</span>
<span id="L1140" rel="#L1140">1140</span>
<span id="L1141" rel="#L1141">1141</span>
<span id="L1142" rel="#L1142">1142</span>
<span id="L1143" rel="#L1143">1143</span>
<span id="L1144" rel="#L1144">1144</span>
<span id="L1145" rel="#L1145">1145</span>
<span id="L1146" rel="#L1146">1146</span>
<span id="L1147" rel="#L1147">1147</span>
<span id="L1148" rel="#L1148">1148</span>
<span id="L1149" rel="#L1149">1149</span>
<span id="L1150" rel="#L1150">1150</span>
<span id="L1151" rel="#L1151">1151</span>
<span id="L1152" rel="#L1152">1152</span>
<span id="L1153" rel="#L1153">1153</span>
<span id="L1154" rel="#L1154">1154</span>
<span id="L1155" rel="#L1155">1155</span>
<span id="L1156" rel="#L1156">1156</span>
<span id="L1157" rel="#L1157">1157</span>
<span id="L1158" rel="#L1158">1158</span>
<span id="L1159" rel="#L1159">1159</span>
<span id="L1160" rel="#L1160">1160</span>
<span id="L1161" rel="#L1161">1161</span>
<span id="L1162" rel="#L1162">1162</span>
<span id="L1163" rel="#L1163">1163</span>
<span id="L1164" rel="#L1164">1164</span>
<span id="L1165" rel="#L1165">1165</span>
<span id="L1166" rel="#L1166">1166</span>
<span id="L1167" rel="#L1167">1167</span>
<span id="L1168" rel="#L1168">1168</span>
<span id="L1169" rel="#L1169">1169</span>
<span id="L1170" rel="#L1170">1170</span>
<span id="L1171" rel="#L1171">1171</span>
<span id="L1172" rel="#L1172">1172</span>
<span id="L1173" rel="#L1173">1173</span>
<span id="L1174" rel="#L1174">1174</span>
<span id="L1175" rel="#L1175">1175</span>
<span id="L1176" rel="#L1176">1176</span>
<span id="L1177" rel="#L1177">1177</span>
<span id="L1178" rel="#L1178">1178</span>
<span id="L1179" rel="#L1179">1179</span>
<span id="L1180" rel="#L1180">1180</span>
<span id="L1181" rel="#L1181">1181</span>
<span id="L1182" rel="#L1182">1182</span>
<span id="L1183" rel="#L1183">1183</span>
<span id="L1184" rel="#L1184">1184</span>
<span id="L1185" rel="#L1185">1185</span>
<span id="L1186" rel="#L1186">1186</span>
<span id="L1187" rel="#L1187">1187</span>
<span id="L1188" rel="#L1188">1188</span>
<span id="L1189" rel="#L1189">1189</span>
<span id="L1190" rel="#L1190">1190</span>
<span id="L1191" rel="#L1191">1191</span>
<span id="L1192" rel="#L1192">1192</span>
<span id="L1193" rel="#L1193">1193</span>
<span id="L1194" rel="#L1194">1194</span>
<span id="L1195" rel="#L1195">1195</span>
<span id="L1196" rel="#L1196">1196</span>
<span id="L1197" rel="#L1197">1197</span>
<span id="L1198" rel="#L1198">1198</span>
<span id="L1199" rel="#L1199">1199</span>
<span id="L1200" rel="#L1200">1200</span>
<span id="L1201" rel="#L1201">1201</span>
<span id="L1202" rel="#L1202">1202</span>
<span id="L1203" rel="#L1203">1203</span>
<span id="L1204" rel="#L1204">1204</span>
<span id="L1205" rel="#L1205">1205</span>
<span id="L1206" rel="#L1206">1206</span>
<span id="L1207" rel="#L1207">1207</span>
<span id="L1208" rel="#L1208">1208</span>
<span id="L1209" rel="#L1209">1209</span>
<span id="L1210" rel="#L1210">1210</span>
<span id="L1211" rel="#L1211">1211</span>
<span id="L1212" rel="#L1212">1212</span>
<span id="L1213" rel="#L1213">1213</span>
<span id="L1214" rel="#L1214">1214</span>
<span id="L1215" rel="#L1215">1215</span>
<span id="L1216" rel="#L1216">1216</span>
<span id="L1217" rel="#L1217">1217</span>
<span id="L1218" rel="#L1218">1218</span>
<span id="L1219" rel="#L1219">1219</span>
<span id="L1220" rel="#L1220">1220</span>
<span id="L1221" rel="#L1221">1221</span>
<span id="L1222" rel="#L1222">1222</span>
<span id="L1223" rel="#L1223">1223</span>
<span id="L1224" rel="#L1224">1224</span>
<span id="L1225" rel="#L1225">1225</span>
<span id="L1226" rel="#L1226">1226</span>
<span id="L1227" rel="#L1227">1227</span>
<span id="L1228" rel="#L1228">1228</span>
<span id="L1229" rel="#L1229">1229</span>
<span id="L1230" rel="#L1230">1230</span>
<span id="L1231" rel="#L1231">1231</span>
<span id="L1232" rel="#L1232">1232</span>
<span id="L1233" rel="#L1233">1233</span>
<span id="L1234" rel="#L1234">1234</span>
<span id="L1235" rel="#L1235">1235</span>
<span id="L1236" rel="#L1236">1236</span>
<span id="L1237" rel="#L1237">1237</span>
<span id="L1238" rel="#L1238">1238</span>
<span id="L1239" rel="#L1239">1239</span>
<span id="L1240" rel="#L1240">1240</span>
<span id="L1241" rel="#L1241">1241</span>
<span id="L1242" rel="#L1242">1242</span>
<span id="L1243" rel="#L1243">1243</span>
<span id="L1244" rel="#L1244">1244</span>
<span id="L1245" rel="#L1245">1245</span>
<span id="L1246" rel="#L1246">1246</span>
<span id="L1247" rel="#L1247">1247</span>
<span id="L1248" rel="#L1248">1248</span>
<span id="L1249" rel="#L1249">1249</span>
<span id="L1250" rel="#L1250">1250</span>
<span id="L1251" rel="#L1251">1251</span>
<span id="L1252" rel="#L1252">1252</span>
<span id="L1253" rel="#L1253">1253</span>
<span id="L1254" rel="#L1254">1254</span>
<span id="L1255" rel="#L1255">1255</span>
<span id="L1256" rel="#L1256">1256</span>
<span id="L1257" rel="#L1257">1257</span>
<span id="L1258" rel="#L1258">1258</span>
<span id="L1259" rel="#L1259">1259</span>
<span id="L1260" rel="#L1260">1260</span>
<span id="L1261" rel="#L1261">1261</span>
<span id="L1262" rel="#L1262">1262</span>
<span id="L1263" rel="#L1263">1263</span>
<span id="L1264" rel="#L1264">1264</span>
<span id="L1265" rel="#L1265">1265</span>
<span id="L1266" rel="#L1266">1266</span>
<span id="L1267" rel="#L1267">1267</span>
<span id="L1268" rel="#L1268">1268</span>
<span id="L1269" rel="#L1269">1269</span>
<span id="L1270" rel="#L1270">1270</span>
<span id="L1271" rel="#L1271">1271</span>
<span id="L1272" rel="#L1272">1272</span>
<span id="L1273" rel="#L1273">1273</span>
<span id="L1274" rel="#L1274">1274</span>
<span id="L1275" rel="#L1275">1275</span>
<span id="L1276" rel="#L1276">1276</span>
<span id="L1277" rel="#L1277">1277</span>
<span id="L1278" rel="#L1278">1278</span>
<span id="L1279" rel="#L1279">1279</span>
<span id="L1280" rel="#L1280">1280</span>
<span id="L1281" rel="#L1281">1281</span>
<span id="L1282" rel="#L1282">1282</span>
<span id="L1283" rel="#L1283">1283</span>
<span id="L1284" rel="#L1284">1284</span>
<span id="L1285" rel="#L1285">1285</span>
<span id="L1286" rel="#L1286">1286</span>
<span id="L1287" rel="#L1287">1287</span>
<span id="L1288" rel="#L1288">1288</span>
<span id="L1289" rel="#L1289">1289</span>
<span id="L1290" rel="#L1290">1290</span>
<span id="L1291" rel="#L1291">1291</span>
<span id="L1292" rel="#L1292">1292</span>
<span id="L1293" rel="#L1293">1293</span>
<span id="L1294" rel="#L1294">1294</span>
<span id="L1295" rel="#L1295">1295</span>
<span id="L1296" rel="#L1296">1296</span>
<span id="L1297" rel="#L1297">1297</span>
<span id="L1298" rel="#L1298">1298</span>
<span id="L1299" rel="#L1299">1299</span>
<span id="L1300" rel="#L1300">1300</span>
<span id="L1301" rel="#L1301">1301</span>
<span id="L1302" rel="#L1302">1302</span>
<span id="L1303" rel="#L1303">1303</span>
<span id="L1304" rel="#L1304">1304</span>
<span id="L1305" rel="#L1305">1305</span>
<span id="L1306" rel="#L1306">1306</span>
<span id="L1307" rel="#L1307">1307</span>
<span id="L1308" rel="#L1308">1308</span>
<span id="L1309" rel="#L1309">1309</span>
<span id="L1310" rel="#L1310">1310</span>
<span id="L1311" rel="#L1311">1311</span>
<span id="L1312" rel="#L1312">1312</span>
<span id="L1313" rel="#L1313">1313</span>
<span id="L1314" rel="#L1314">1314</span>
<span id="L1315" rel="#L1315">1315</span>
<span id="L1316" rel="#L1316">1316</span>
<span id="L1317" rel="#L1317">1317</span>
<span id="L1318" rel="#L1318">1318</span>
<span id="L1319" rel="#L1319">1319</span>
<span id="L1320" rel="#L1320">1320</span>
<span id="L1321" rel="#L1321">1321</span>
<span id="L1322" rel="#L1322">1322</span>
<span id="L1323" rel="#L1323">1323</span>
<span id="L1324" rel="#L1324">1324</span>
<span id="L1325" rel="#L1325">1325</span>
<span id="L1326" rel="#L1326">1326</span>
<span id="L1327" rel="#L1327">1327</span>
<span id="L1328" rel="#L1328">1328</span>
<span id="L1329" rel="#L1329">1329</span>
<span id="L1330" rel="#L1330">1330</span>
<span id="L1331" rel="#L1331">1331</span>
<span id="L1332" rel="#L1332">1332</span>
<span id="L1333" rel="#L1333">1333</span>
<span id="L1334" rel="#L1334">1334</span>
<span id="L1335" rel="#L1335">1335</span>
<span id="L1336" rel="#L1336">1336</span>
<span id="L1337" rel="#L1337">1337</span>
<span id="L1338" rel="#L1338">1338</span>
<span id="L1339" rel="#L1339">1339</span>
<span id="L1340" rel="#L1340">1340</span>
<span id="L1341" rel="#L1341">1341</span>
<span id="L1342" rel="#L1342">1342</span>
<span id="L1343" rel="#L1343">1343</span>
<span id="L1344" rel="#L1344">1344</span>
<span id="L1345" rel="#L1345">1345</span>
<span id="L1346" rel="#L1346">1346</span>
<span id="L1347" rel="#L1347">1347</span>
<span id="L1348" rel="#L1348">1348</span>
<span id="L1349" rel="#L1349">1349</span>
<span id="L1350" rel="#L1350">1350</span>
<span id="L1351" rel="#L1351">1351</span>
<span id="L1352" rel="#L1352">1352</span>
<span id="L1353" rel="#L1353">1353</span>
<span id="L1354" rel="#L1354">1354</span>
<span id="L1355" rel="#L1355">1355</span>
<span id="L1356" rel="#L1356">1356</span>
<span id="L1357" rel="#L1357">1357</span>
<span id="L1358" rel="#L1358">1358</span>
<span id="L1359" rel="#L1359">1359</span>
<span id="L1360" rel="#L1360">1360</span>
<span id="L1361" rel="#L1361">1361</span>
<span id="L1362" rel="#L1362">1362</span>
<span id="L1363" rel="#L1363">1363</span>
<span id="L1364" rel="#L1364">1364</span>
<span id="L1365" rel="#L1365">1365</span>
<span id="L1366" rel="#L1366">1366</span>
<span id="L1367" rel="#L1367">1367</span>
<span id="L1368" rel="#L1368">1368</span>
<span id="L1369" rel="#L1369">1369</span>
<span id="L1370" rel="#L1370">1370</span>
<span id="L1371" rel="#L1371">1371</span>
<span id="L1372" rel="#L1372">1372</span>
<span id="L1373" rel="#L1373">1373</span>
<span id="L1374" rel="#L1374">1374</span>
<span id="L1375" rel="#L1375">1375</span>
<span id="L1376" rel="#L1376">1376</span>
<span id="L1377" rel="#L1377">1377</span>
<span id="L1378" rel="#L1378">1378</span>
<span id="L1379" rel="#L1379">1379</span>
<span id="L1380" rel="#L1380">1380</span>
<span id="L1381" rel="#L1381">1381</span>
<span id="L1382" rel="#L1382">1382</span>
<span id="L1383" rel="#L1383">1383</span>
<span id="L1384" rel="#L1384">1384</span>
<span id="L1385" rel="#L1385">1385</span>
<span id="L1386" rel="#L1386">1386</span>
<span id="L1387" rel="#L1387">1387</span>
<span id="L1388" rel="#L1388">1388</span>
<span id="L1389" rel="#L1389">1389</span>
<span id="L1390" rel="#L1390">1390</span>
<span id="L1391" rel="#L1391">1391</span>
<span id="L1392" rel="#L1392">1392</span>
<span id="L1393" rel="#L1393">1393</span>
<span id="L1394" rel="#L1394">1394</span>
<span id="L1395" rel="#L1395">1395</span>
<span id="L1396" rel="#L1396">1396</span>
<span id="L1397" rel="#L1397">1397</span>
<span id="L1398" rel="#L1398">1398</span>
<span id="L1399" rel="#L1399">1399</span>
<span id="L1400" rel="#L1400">1400</span>
<span id="L1401" rel="#L1401">1401</span>
<span id="L1402" rel="#L1402">1402</span>
<span id="L1403" rel="#L1403">1403</span>
<span id="L1404" rel="#L1404">1404</span>
<span id="L1405" rel="#L1405">1405</span>
<span id="L1406" rel="#L1406">1406</span>
<span id="L1407" rel="#L1407">1407</span>
<span id="L1408" rel="#L1408">1408</span>
<span id="L1409" rel="#L1409">1409</span>
<span id="L1410" rel="#L1410">1410</span>
<span id="L1411" rel="#L1411">1411</span>
<span id="L1412" rel="#L1412">1412</span>
<span id="L1413" rel="#L1413">1413</span>
<span id="L1414" rel="#L1414">1414</span>
<span id="L1415" rel="#L1415">1415</span>
<span id="L1416" rel="#L1416">1416</span>
<span id="L1417" rel="#L1417">1417</span>
<span id="L1418" rel="#L1418">1418</span>
<span id="L1419" rel="#L1419">1419</span>
<span id="L1420" rel="#L1420">1420</span>
<span id="L1421" rel="#L1421">1421</span>
<span id="L1422" rel="#L1422">1422</span>
<span id="L1423" rel="#L1423">1423</span>
<span id="L1424" rel="#L1424">1424</span>
<span id="L1425" rel="#L1425">1425</span>
<span id="L1426" rel="#L1426">1426</span>
<span id="L1427" rel="#L1427">1427</span>
<span id="L1428" rel="#L1428">1428</span>
<span id="L1429" rel="#L1429">1429</span>
<span id="L1430" rel="#L1430">1430</span>
<span id="L1431" rel="#L1431">1431</span>
<span id="L1432" rel="#L1432">1432</span>
<span id="L1433" rel="#L1433">1433</span>
<span id="L1434" rel="#L1434">1434</span>
<span id="L1435" rel="#L1435">1435</span>
<span id="L1436" rel="#L1436">1436</span>
<span id="L1437" rel="#L1437">1437</span>
<span id="L1438" rel="#L1438">1438</span>
<span id="L1439" rel="#L1439">1439</span>
<span id="L1440" rel="#L1440">1440</span>
<span id="L1441" rel="#L1441">1441</span>
<span id="L1442" rel="#L1442">1442</span>
<span id="L1443" rel="#L1443">1443</span>
<span id="L1444" rel="#L1444">1444</span>
<span id="L1445" rel="#L1445">1445</span>
<span id="L1446" rel="#L1446">1446</span>
<span id="L1447" rel="#L1447">1447</span>
<span id="L1448" rel="#L1448">1448</span>
<span id="L1449" rel="#L1449">1449</span>
<span id="L1450" rel="#L1450">1450</span>
<span id="L1451" rel="#L1451">1451</span>
<span id="L1452" rel="#L1452">1452</span>
<span id="L1453" rel="#L1453">1453</span>
<span id="L1454" rel="#L1454">1454</span>
<span id="L1455" rel="#L1455">1455</span>
<span id="L1456" rel="#L1456">1456</span>
<span id="L1457" rel="#L1457">1457</span>
<span id="L1458" rel="#L1458">1458</span>
<span id="L1459" rel="#L1459">1459</span>
<span id="L1460" rel="#L1460">1460</span>
<span id="L1461" rel="#L1461">1461</span>
<span id="L1462" rel="#L1462">1462</span>
<span id="L1463" rel="#L1463">1463</span>
<span id="L1464" rel="#L1464">1464</span>
<span id="L1465" rel="#L1465">1465</span>
<span id="L1466" rel="#L1466">1466</span>
<span id="L1467" rel="#L1467">1467</span>
<span id="L1468" rel="#L1468">1468</span>
<span id="L1469" rel="#L1469">1469</span>
<span id="L1470" rel="#L1470">1470</span>
<span id="L1471" rel="#L1471">1471</span>
<span id="L1472" rel="#L1472">1472</span>
<span id="L1473" rel="#L1473">1473</span>
<span id="L1474" rel="#L1474">1474</span>
<span id="L1475" rel="#L1475">1475</span>
<span id="L1476" rel="#L1476">1476</span>
<span id="L1477" rel="#L1477">1477</span>
<span id="L1478" rel="#L1478">1478</span>
<span id="L1479" rel="#L1479">1479</span>
<span id="L1480" rel="#L1480">1480</span>
<span id="L1481" rel="#L1481">1481</span>
<span id="L1482" rel="#L1482">1482</span>
<span id="L1483" rel="#L1483">1483</span>
<span id="L1484" rel="#L1484">1484</span>
<span id="L1485" rel="#L1485">1485</span>
<span id="L1486" rel="#L1486">1486</span>
<span id="L1487" rel="#L1487">1487</span>
<span id="L1488" rel="#L1488">1488</span>
<span id="L1489" rel="#L1489">1489</span>
<span id="L1490" rel="#L1490">1490</span>
<span id="L1491" rel="#L1491">1491</span>
<span id="L1492" rel="#L1492">1492</span>
<span id="L1493" rel="#L1493">1493</span>
<span id="L1494" rel="#L1494">1494</span>
<span id="L1495" rel="#L1495">1495</span>
<span id="L1496" rel="#L1496">1496</span>
<span id="L1497" rel="#L1497">1497</span>
<span id="L1498" rel="#L1498">1498</span>
<span id="L1499" rel="#L1499">1499</span>
<span id="L1500" rel="#L1500">1500</span>
<span id="L1501" rel="#L1501">1501</span>
<span id="L1502" rel="#L1502">1502</span>
<span id="L1503" rel="#L1503">1503</span>
<span id="L1504" rel="#L1504">1504</span>
<span id="L1505" rel="#L1505">1505</span>
<span id="L1506" rel="#L1506">1506</span>
<span id="L1507" rel="#L1507">1507</span>
<span id="L1508" rel="#L1508">1508</span>
<span id="L1509" rel="#L1509">1509</span>
<span id="L1510" rel="#L1510">1510</span>
<span id="L1511" rel="#L1511">1511</span>
<span id="L1512" rel="#L1512">1512</span>
<span id="L1513" rel="#L1513">1513</span>
<span id="L1514" rel="#L1514">1514</span>
<span id="L1515" rel="#L1515">1515</span>
<span id="L1516" rel="#L1516">1516</span>
<span id="L1517" rel="#L1517">1517</span>
<span id="L1518" rel="#L1518">1518</span>
<span id="L1519" rel="#L1519">1519</span>
<span id="L1520" rel="#L1520">1520</span>
<span id="L1521" rel="#L1521">1521</span>
<span id="L1522" rel="#L1522">1522</span>
<span id="L1523" rel="#L1523">1523</span>
<span id="L1524" rel="#L1524">1524</span>
<span id="L1525" rel="#L1525">1525</span>
<span id="L1526" rel="#L1526">1526</span>
<span id="L1527" rel="#L1527">1527</span>
<span id="L1528" rel="#L1528">1528</span>
<span id="L1529" rel="#L1529">1529</span>
<span id="L1530" rel="#L1530">1530</span>
<span id="L1531" rel="#L1531">1531</span>
<span id="L1532" rel="#L1532">1532</span>
<span id="L1533" rel="#L1533">1533</span>
<span id="L1534" rel="#L1534">1534</span>
<span id="L1535" rel="#L1535">1535</span>
<span id="L1536" rel="#L1536">1536</span>
<span id="L1537" rel="#L1537">1537</span>
<span id="L1538" rel="#L1538">1538</span>
<span id="L1539" rel="#L1539">1539</span>
<span id="L1540" rel="#L1540">1540</span>
<span id="L1541" rel="#L1541">1541</span>
<span id="L1542" rel="#L1542">1542</span>
<span id="L1543" rel="#L1543">1543</span>
<span id="L1544" rel="#L1544">1544</span>
<span id="L1545" rel="#L1545">1545</span>
<span id="L1546" rel="#L1546">1546</span>
<span id="L1547" rel="#L1547">1547</span>
<span id="L1548" rel="#L1548">1548</span>
<span id="L1549" rel="#L1549">1549</span>
<span id="L1550" rel="#L1550">1550</span>
<span id="L1551" rel="#L1551">1551</span>
<span id="L1552" rel="#L1552">1552</span>
<span id="L1553" rel="#L1553">1553</span>
<span id="L1554" rel="#L1554">1554</span>
<span id="L1555" rel="#L1555">1555</span>
<span id="L1556" rel="#L1556">1556</span>
<span id="L1557" rel="#L1557">1557</span>
<span id="L1558" rel="#L1558">1558</span>
<span id="L1559" rel="#L1559">1559</span>
<span id="L1560" rel="#L1560">1560</span>
<span id="L1561" rel="#L1561">1561</span>
<span id="L1562" rel="#L1562">1562</span>
<span id="L1563" rel="#L1563">1563</span>
<span id="L1564" rel="#L1564">1564</span>
<span id="L1565" rel="#L1565">1565</span>
<span id="L1566" rel="#L1566">1566</span>
<span id="L1567" rel="#L1567">1567</span>
<span id="L1568" rel="#L1568">1568</span>
<span id="L1569" rel="#L1569">1569</span>
<span id="L1570" rel="#L1570">1570</span>
<span id="L1571" rel="#L1571">1571</span>
<span id="L1572" rel="#L1572">1572</span>
<span id="L1573" rel="#L1573">1573</span>
<span id="L1574" rel="#L1574">1574</span>
<span id="L1575" rel="#L1575">1575</span>
<span id="L1576" rel="#L1576">1576</span>
<span id="L1577" rel="#L1577">1577</span>
<span id="L1578" rel="#L1578">1578</span>
<span id="L1579" rel="#L1579">1579</span>
<span id="L1580" rel="#L1580">1580</span>
<span id="L1581" rel="#L1581">1581</span>
<span id="L1582" rel="#L1582">1582</span>
<span id="L1583" rel="#L1583">1583</span>
<span id="L1584" rel="#L1584">1584</span>
<span id="L1585" rel="#L1585">1585</span>
<span id="L1586" rel="#L1586">1586</span>
<span id="L1587" rel="#L1587">1587</span>
<span id="L1588" rel="#L1588">1588</span>
<span id="L1589" rel="#L1589">1589</span>
<span id="L1590" rel="#L1590">1590</span>
<span id="L1591" rel="#L1591">1591</span>
<span id="L1592" rel="#L1592">1592</span>
<span id="L1593" rel="#L1593">1593</span>
<span id="L1594" rel="#L1594">1594</span>
<span id="L1595" rel="#L1595">1595</span>
<span id="L1596" rel="#L1596">1596</span>
<span id="L1597" rel="#L1597">1597</span>
<span id="L1598" rel="#L1598">1598</span>
<span id="L1599" rel="#L1599">1599</span>
<span id="L1600" rel="#L1600">1600</span>
<span id="L1601" rel="#L1601">1601</span>
<span id="L1602" rel="#L1602">1602</span>
<span id="L1603" rel="#L1603">1603</span>
<span id="L1604" rel="#L1604">1604</span>
<span id="L1605" rel="#L1605">1605</span>
<span id="L1606" rel="#L1606">1606</span>
<span id="L1607" rel="#L1607">1607</span>
<span id="L1608" rel="#L1608">1608</span>
<span id="L1609" rel="#L1609">1609</span>
<span id="L1610" rel="#L1610">1610</span>
<span id="L1611" rel="#L1611">1611</span>
<span id="L1612" rel="#L1612">1612</span>
<span id="L1613" rel="#L1613">1613</span>
<span id="L1614" rel="#L1614">1614</span>
<span id="L1615" rel="#L1615">1615</span>
<span id="L1616" rel="#L1616">1616</span>
<span id="L1617" rel="#L1617">1617</span>
<span id="L1618" rel="#L1618">1618</span>
<span id="L1619" rel="#L1619">1619</span>
<span id="L1620" rel="#L1620">1620</span>
<span id="L1621" rel="#L1621">1621</span>
<span id="L1622" rel="#L1622">1622</span>
<span id="L1623" rel="#L1623">1623</span>
<span id="L1624" rel="#L1624">1624</span>
<span id="L1625" rel="#L1625">1625</span>
<span id="L1626" rel="#L1626">1626</span>
<span id="L1627" rel="#L1627">1627</span>
<span id="L1628" rel="#L1628">1628</span>
<span id="L1629" rel="#L1629">1629</span>
<span id="L1630" rel="#L1630">1630</span>
<span id="L1631" rel="#L1631">1631</span>
<span id="L1632" rel="#L1632">1632</span>
<span id="L1633" rel="#L1633">1633</span>
<span id="L1634" rel="#L1634">1634</span>
<span id="L1635" rel="#L1635">1635</span>
<span id="L1636" rel="#L1636">1636</span>
<span id="L1637" rel="#L1637">1637</span>
<span id="L1638" rel="#L1638">1638</span>
<span id="L1639" rel="#L1639">1639</span>
<span id="L1640" rel="#L1640">1640</span>
<span id="L1641" rel="#L1641">1641</span>
<span id="L1642" rel="#L1642">1642</span>
<span id="L1643" rel="#L1643">1643</span>
<span id="L1644" rel="#L1644">1644</span>
<span id="L1645" rel="#L1645">1645</span>
<span id="L1646" rel="#L1646">1646</span>
<span id="L1647" rel="#L1647">1647</span>
<span id="L1648" rel="#L1648">1648</span>
<span id="L1649" rel="#L1649">1649</span>
<span id="L1650" rel="#L1650">1650</span>
<span id="L1651" rel="#L1651">1651</span>
<span id="L1652" rel="#L1652">1652</span>
<span id="L1653" rel="#L1653">1653</span>
<span id="L1654" rel="#L1654">1654</span>
<span id="L1655" rel="#L1655">1655</span>
<span id="L1656" rel="#L1656">1656</span>
<span id="L1657" rel="#L1657">1657</span>
<span id="L1658" rel="#L1658">1658</span>
<span id="L1659" rel="#L1659">1659</span>
<span id="L1660" rel="#L1660">1660</span>
<span id="L1661" rel="#L1661">1661</span>
<span id="L1662" rel="#L1662">1662</span>
<span id="L1663" rel="#L1663">1663</span>
<span id="L1664" rel="#L1664">1664</span>
<span id="L1665" rel="#L1665">1665</span>
<span id="L1666" rel="#L1666">1666</span>
<span id="L1667" rel="#L1667">1667</span>
<span id="L1668" rel="#L1668">1668</span>
<span id="L1669" rel="#L1669">1669</span>
<span id="L1670" rel="#L1670">1670</span>
<span id="L1671" rel="#L1671">1671</span>
<span id="L1672" rel="#L1672">1672</span>
<span id="L1673" rel="#L1673">1673</span>
<span id="L1674" rel="#L1674">1674</span>
<span id="L1675" rel="#L1675">1675</span>
<span id="L1676" rel="#L1676">1676</span>
<span id="L1677" rel="#L1677">1677</span>
<span id="L1678" rel="#L1678">1678</span>
<span id="L1679" rel="#L1679">1679</span>
<span id="L1680" rel="#L1680">1680</span>
<span id="L1681" rel="#L1681">1681</span>
<span id="L1682" rel="#L1682">1682</span>
<span id="L1683" rel="#L1683">1683</span>

           </td>
           <td class="blob-line-code"><div class="code-body highlight"><pre><div class='line' id='LC1'><span class="kn">package</span> <span class="n">org</span><span class="o">.</span><span class="na">json</span><span class="o">;</span></div><div class='line' id='LC2'><br/></div><div class='line' id='LC3'><span class="cm">/*</span></div><div class='line' id='LC4'><span class="cm"> Copyright (c) 2002 JSON.org</span></div><div class='line' id='LC5'><br/></div><div class='line' id='LC6'><span class="cm"> Permission is hereby granted, free of charge, to any person obtaining a copy</span></div><div class='line' id='LC7'><span class="cm"> of this software and associated documentation files (the &quot;Software&quot;), to deal</span></div><div class='line' id='LC8'><span class="cm"> in the Software without restriction, including without limitation the rights</span></div><div class='line' id='LC9'><span class="cm"> to use, copy, modify, merge, publish, distribute, sublicense, and/or sell</span></div><div class='line' id='LC10'><span class="cm"> copies of the Software, and to permit persons to whom the Software is</span></div><div class='line' id='LC11'><span class="cm"> furnished to do so, subject to the following conditions:</span></div><div class='line' id='LC12'><br/></div><div class='line' id='LC13'><span class="cm"> The above copyright notice and this permission notice shall be included in all</span></div><div class='line' id='LC14'><span class="cm"> copies or substantial portions of the Software.</span></div><div class='line' id='LC15'><br/></div><div class='line' id='LC16'><span class="cm"> The Software shall be used for Good, not Evil.</span></div><div class='line' id='LC17'><br/></div><div class='line' id='LC18'><span class="cm"> THE SOFTWARE IS PROVIDED &quot;AS IS&quot;, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR</span></div><div class='line' id='LC19'><span class="cm"> IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,</span></div><div class='line' id='LC20'><span class="cm"> FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE</span></div><div class='line' id='LC21'><span class="cm"> AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER</span></div><div class='line' id='LC22'><span class="cm"> LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,</span></div><div class='line' id='LC23'><span class="cm"> OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE</span></div><div class='line' id='LC24'><span class="cm"> SOFTWARE.</span></div><div class='line' id='LC25'><span class="cm"> */</span></div><div class='line' id='LC26'><br/></div><div class='line' id='LC27'><span class="kn">import</span> <span class="nn">java.io.IOException</span><span class="o">;</span></div><div class='line' id='LC28'><span class="kn">import</span> <span class="nn">java.io.StringWriter</span><span class="o">;</span></div><div class='line' id='LC29'><span class="kn">import</span> <span class="nn">java.io.Writer</span><span class="o">;</span></div><div class='line' id='LC30'><span class="kn">import</span> <span class="nn">java.lang.reflect.Field</span><span class="o">;</span></div><div class='line' id='LC31'><span class="kn">import</span> <span class="nn">java.lang.reflect.Method</span><span class="o">;</span></div><div class='line' id='LC32'><span class="kn">import</span> <span class="nn">java.lang.reflect.Modifier</span><span class="o">;</span></div><div class='line' id='LC33'><span class="kn">import</span> <span class="nn">java.util.Collection</span><span class="o">;</span></div><div class='line' id='LC34'><span class="kn">import</span> <span class="nn">java.util.Enumeration</span><span class="o">;</span></div><div class='line' id='LC35'><span class="kn">import</span> <span class="nn">java.util.HashMap</span><span class="o">;</span></div><div class='line' id='LC36'><span class="kn">import</span> <span class="nn">java.util.Iterator</span><span class="o">;</span></div><div class='line' id='LC37'><span class="kn">import</span> <span class="nn">java.util.Locale</span><span class="o">;</span></div><div class='line' id='LC38'><span class="kn">import</span> <span class="nn">java.util.Map</span><span class="o">;</span></div><div class='line' id='LC39'><span class="kn">import</span> <span class="nn">java.util.Map.Entry</span><span class="o">;</span></div><div class='line' id='LC40'><span class="kn">import</span> <span class="nn">java.util.ResourceBundle</span><span class="o">;</span></div><div class='line' id='LC41'><span class="kn">import</span> <span class="nn">java.util.Set</span><span class="o">;</span></div><div class='line' id='LC42'><br/></div><div class='line' id='LC43'><span class="cm">/**</span></div><div class='line' id='LC44'><span class="cm"> * A JSONObject is an unordered collection of name/value pairs. Its external</span></div><div class='line' id='LC45'><span class="cm"> * form is a string wrapped in curly braces with colons between the names and</span></div><div class='line' id='LC46'><span class="cm"> * values, and commas between the values and names. The internal form is an</span></div><div class='line' id='LC47'><span class="cm"> * object having &lt;code&gt;get&lt;/code&gt; and &lt;code&gt;opt&lt;/code&gt; methods for accessing</span></div><div class='line' id='LC48'><span class="cm"> * the values by name, and &lt;code&gt;put&lt;/code&gt; methods for adding or replacing</span></div><div class='line' id='LC49'><span class="cm"> * values by name. The values can be any of these types: &lt;code&gt;Boolean&lt;/code&gt;,</span></div><div class='line' id='LC50'><span class="cm"> * &lt;code&gt;JSONArray&lt;/code&gt;, &lt;code&gt;JSONObject&lt;/code&gt;, &lt;code&gt;Number&lt;/code&gt;,</span></div><div class='line' id='LC51'><span class="cm"> * &lt;code&gt;String&lt;/code&gt;, or the &lt;code&gt;JSONObject.NULL&lt;/code&gt; object. A</span></div><div class='line' id='LC52'><span class="cm"> * JSONObject constructor can be used to convert an external form JSON text</span></div><div class='line' id='LC53'><span class="cm"> * into an internal form whose values can be retrieved with the</span></div><div class='line' id='LC54'><span class="cm"> * &lt;code&gt;get&lt;/code&gt; and &lt;code&gt;opt&lt;/code&gt; methods, or to convert values into a</span></div><div class='line' id='LC55'><span class="cm"> * JSON text using the &lt;code&gt;put&lt;/code&gt; and &lt;code&gt;toString&lt;/code&gt; methods. A</span></div><div class='line' id='LC56'><span class="cm"> * &lt;code&gt;get&lt;/code&gt; method returns a value if one can be found, and throws an</span></div><div class='line' id='LC57'><span class="cm"> * exception if one cannot be found. An &lt;code&gt;opt&lt;/code&gt; method returns a</span></div><div class='line' id='LC58'><span class="cm"> * default value instead of throwing an exception, and so is useful for</span></div><div class='line' id='LC59'><span class="cm"> * obtaining optional values.</span></div><div class='line' id='LC60'><span class="cm"> * &lt;p&gt;</span></div><div class='line' id='LC61'><span class="cm"> * The generic &lt;code&gt;get()&lt;/code&gt; and &lt;code&gt;opt()&lt;/code&gt; methods return an</span></div><div class='line' id='LC62'><span class="cm"> * object, which you can cast or query for type. There are also typed</span></div><div class='line' id='LC63'><span class="cm"> * &lt;code&gt;get&lt;/code&gt; and &lt;code&gt;opt&lt;/code&gt; methods that do type checking and type</span></div><div class='line' id='LC64'><span class="cm"> * coercion for you. The opt methods differ from the get methods in that they</span></div><div class='line' id='LC65'><span class="cm"> * do not throw. Instead, they return a specified value, such as null.</span></div><div class='line' id='LC66'><span class="cm"> * &lt;p&gt;</span></div><div class='line' id='LC67'><span class="cm"> * The &lt;code&gt;put&lt;/code&gt; methods add or replace values in an object. For</span></div><div class='line' id='LC68'><span class="cm"> * example,</span></div><div class='line' id='LC69'><span class="cm"> *</span></div><div class='line' id='LC70'><span class="cm"> * &lt;pre&gt;</span></div><div class='line' id='LC71'><span class="cm"> * myString = new JSONObject()</span></div><div class='line' id='LC72'><span class="cm"> *         .put(&amp;quot;JSON&amp;quot;, &amp;quot;Hello, World!&amp;quot;).toString();</span></div><div class='line' id='LC73'><span class="cm"> * &lt;/pre&gt;</span></div><div class='line' id='LC74'><span class="cm"> *</span></div><div class='line' id='LC75'><span class="cm"> * produces the string &lt;code&gt;{&quot;JSON&quot;: &quot;Hello, World&quot;}&lt;/code&gt;.</span></div><div class='line' id='LC76'><span class="cm"> * &lt;p&gt;</span></div><div class='line' id='LC77'><span class="cm"> * The texts produced by the &lt;code&gt;toString&lt;/code&gt; methods strictly conform to</span></div><div class='line' id='LC78'><span class="cm"> * the JSON syntax rules. The constructors are more forgiving in the texts they</span></div><div class='line' id='LC79'><span class="cm"> * will accept:</span></div><div class='line' id='LC80'><span class="cm"> * &lt;ul&gt;</span></div><div class='line' id='LC81'><span class="cm"> * &lt;li&gt;An extra &lt;code&gt;,&lt;/code&gt;&amp;nbsp;&lt;small&gt;(comma)&lt;/small&gt; may appear just</span></div><div class='line' id='LC82'><span class="cm"> * before the closing brace.&lt;/li&gt;</span></div><div class='line' id='LC83'><span class="cm"> * &lt;li&gt;Strings may be quoted with &lt;code&gt;&#39;&lt;/code&gt;&amp;nbsp;&lt;small&gt;(single</span></div><div class='line' id='LC84'><span class="cm"> * quote)&lt;/small&gt;.&lt;/li&gt;</span></div><div class='line' id='LC85'><span class="cm"> * &lt;li&gt;Strings do not need to be quoted at all if they do not begin with a</span></div><div class='line' id='LC86'><span class="cm"> * quote or single quote, and if they do not contain leading or trailing</span></div><div class='line' id='LC87'><span class="cm"> * spaces, and if they do not contain any of these characters:</span></div><div class='line' id='LC88'><span class="cm"> * &lt;code&gt;{ } [ ] / \ : , #&lt;/code&gt; and if they do not look like numbers and</span></div><div class='line' id='LC89'><span class="cm"> * if they are not the reserved words &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt;,</span></div><div class='line' id='LC90'><span class="cm"> * or &lt;code&gt;null&lt;/code&gt;.&lt;/li&gt;</span></div><div class='line' id='LC91'><span class="cm"> * &lt;/ul&gt;</span></div><div class='line' id='LC92'><span class="cm"> *</span></div><div class='line' id='LC93'><span class="cm"> * @author JSON.org</span></div><div class='line' id='LC94'><span class="cm"> * @version 2014-05-03</span></div><div class='line' id='LC95'><span class="cm"> */</span></div><div class='line' id='LC96'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">JSONObject</span> <span class="o">{</span></div><div class='line' id='LC97'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC98'><span class="cm">     * JSONObject.NULL is equivalent to the value that JavaScript calls null,</span></div><div class='line' id='LC99'><span class="cm">     * whilst Java&#39;s null is equivalent to the value that JavaScript calls</span></div><div class='line' id='LC100'><span class="cm">     * undefined.</span></div><div class='line' id='LC101'><span class="cm">     */</span></div><div class='line' id='LC102'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kd">class</span> <span class="nc">Null</span> <span class="o">{</span></div><div class='line' id='LC103'><br/></div><div class='line' id='LC104'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC105'><span class="cm">         * There is only intended to be a single instance of the NULL object,</span></div><div class='line' id='LC106'><span class="cm">         * so the clone method returns itself.</span></div><div class='line' id='LC107'><span class="cm">         *</span></div><div class='line' id='LC108'><span class="cm">         * @return NULL.</span></div><div class='line' id='LC109'><span class="cm">         */</span></div><div class='line' id='LC110'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC111'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">protected</span> <span class="kd">final</span> <span class="n">Object</span> <span class="nf">clone</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC112'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC113'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC114'><br/></div><div class='line' id='LC115'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC116'><span class="cm">         * A Null object is equal to the null value and to itself.</span></div><div class='line' id='LC117'><span class="cm">         *</span></div><div class='line' id='LC118'><span class="cm">         * @param object</span></div><div class='line' id='LC119'><span class="cm">         *            An object to test for nullness.</span></div><div class='line' id='LC120'><span class="cm">         * @return true if the object parameter is the JSONObject.NULL object or</span></div><div class='line' id='LC121'><span class="cm">         *         null.</span></div><div class='line' id='LC122'><span class="cm">         */</span></div><div class='line' id='LC123'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC124'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">equals</span><span class="o">(</span><span class="n">Object</span> <span class="n">object</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC125'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">object</span> <span class="o">==</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC126'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC127'><br/></div><div class='line' id='LC128'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC129'><span class="cm">         * Get the &quot;null&quot; string value.</span></div><div class='line' id='LC130'><span class="cm">         *</span></div><div class='line' id='LC131'><span class="cm">         * @return The string &quot;null&quot;.</span></div><div class='line' id='LC132'><span class="cm">         */</span></div><div class='line' id='LC133'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">toString</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC134'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="s">&quot;null&quot;</span><span class="o">;</span></div><div class='line' id='LC135'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC136'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC137'><br/></div><div class='line' id='LC138'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC139'><span class="cm">     * The map where the JSONObject&#39;s properties are kept.</span></div><div class='line' id='LC140'><span class="cm">     */</span></div><div class='line' id='LC141'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">final</span> <span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;</span> <span class="n">map</span><span class="o">;</span></div><div class='line' id='LC142'><br/></div><div class='line' id='LC143'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC144'><span class="cm">     * It is sometimes more convenient and less ambiguous to have a</span></div><div class='line' id='LC145'><span class="cm">     * &lt;code&gt;NULL&lt;/code&gt; object than to use Java&#39;s &lt;code&gt;null&lt;/code&gt; value.</span></div><div class='line' id='LC146'><span class="cm">     * &lt;code&gt;JSONObject.NULL.equals(null)&lt;/code&gt; returns &lt;code&gt;true&lt;/code&gt;.</span></div><div class='line' id='LC147'><span class="cm">     * &lt;code&gt;JSONObject.NULL.toString()&lt;/code&gt; returns &lt;code&gt;&quot;null&quot;&lt;/code&gt;.</span></div><div class='line' id='LC148'><span class="cm">     */</span></div><div class='line' id='LC149'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">Object</span> <span class="n">NULL</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Null</span><span class="o">();</span></div><div class='line' id='LC150'><br/></div><div class='line' id='LC151'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC152'><span class="cm">     * Construct an empty JSONObject.</span></div><div class='line' id='LC153'><span class="cm">     */</span></div><div class='line' id='LC154'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONObject</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC155'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">map</span> <span class="o">=</span> <span class="k">new</span> <span class="n">HashMap</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;();</span></div><div class='line' id='LC156'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC157'><br/></div><div class='line' id='LC158'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC159'><span class="cm">     * Construct a JSONObject from a subset of another JSONObject. An array of</span></div><div class='line' id='LC160'><span class="cm">     * strings is used to identify the keys that should be copied. Missing keys</span></div><div class='line' id='LC161'><span class="cm">     * are ignored.</span></div><div class='line' id='LC162'><span class="cm">     *</span></div><div class='line' id='LC163'><span class="cm">     * @param jo</span></div><div class='line' id='LC164'><span class="cm">     *            A JSONObject.</span></div><div class='line' id='LC165'><span class="cm">     * @param names</span></div><div class='line' id='LC166'><span class="cm">     *            An array of strings.</span></div><div class='line' id='LC167'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC168'><span class="cm">     * @exception JSONException</span></div><div class='line' id='LC169'><span class="cm">     *                If a value is a non-finite number or if a name is</span></div><div class='line' id='LC170'><span class="cm">     *                duplicated.</span></div><div class='line' id='LC171'><span class="cm">     */</span></div><div class='line' id='LC172'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONObject</span><span class="o">(</span><span class="n">JSONObject</span> <span class="n">jo</span><span class="o">,</span> <span class="n">String</span><span class="o">[]</span> <span class="n">names</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC173'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">();</span></div><div class='line' id='LC174'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">names</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC175'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC176'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">putOnce</span><span class="o">(</span><span class="n">names</span><span class="o">[</span><span class="n">i</span><span class="o">],</span> <span class="n">jo</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">names</span><span class="o">[</span><span class="n">i</span><span class="o">]));</span></div><div class='line' id='LC177'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">ignore</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC178'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC179'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC180'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC181'><br/></div><div class='line' id='LC182'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC183'><span class="cm">     * Construct a JSONObject from a JSONTokener.</span></div><div class='line' id='LC184'><span class="cm">     *</span></div><div class='line' id='LC185'><span class="cm">     * @param x</span></div><div class='line' id='LC186'><span class="cm">     *            A JSONTokener object containing the source string.</span></div><div class='line' id='LC187'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC188'><span class="cm">     *             If there is a syntax error in the source string or a</span></div><div class='line' id='LC189'><span class="cm">     *             duplicated key.</span></div><div class='line' id='LC190'><span class="cm">     */</span></div><div class='line' id='LC191'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONObject</span><span class="o">(</span><span class="n">JSONTokener</span> <span class="n">x</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC192'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">();</span></div><div class='line' id='LC193'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">char</span> <span class="n">c</span><span class="o">;</span></div><div class='line' id='LC194'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">key</span><span class="o">;</span></div><div class='line' id='LC195'><br/></div><div class='line' id='LC196'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">x</span><span class="o">.</span><span class="na">nextClean</span><span class="o">()</span> <span class="o">!=</span> <span class="sc">&#39;{&#39;</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC197'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="n">x</span><span class="o">.</span><span class="na">syntaxError</span><span class="o">(</span><span class="s">&quot;A JSONObject text must begin with &#39;{&#39;&quot;</span><span class="o">);</span></div><div class='line' id='LC198'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC199'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(;;)</span> <span class="o">{</span></div><div class='line' id='LC200'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">c</span> <span class="o">=</span> <span class="n">x</span><span class="o">.</span><span class="na">nextClean</span><span class="o">();</span></div><div class='line' id='LC201'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">switch</span> <span class="o">(</span><span class="n">c</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC202'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="mi">0</span><span class="o">:</span></div><div class='line' id='LC203'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="n">x</span><span class="o">.</span><span class="na">syntaxError</span><span class="o">(</span><span class="s">&quot;A JSONObject text must end with &#39;}&#39;&quot;</span><span class="o">);</span></div><div class='line' id='LC204'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;}&#39;</span><span class="o">:</span></div><div class='line' id='LC205'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC206'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">default</span><span class="o">:</span></div><div class='line' id='LC207'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">x</span><span class="o">.</span><span class="na">back</span><span class="o">();</span></div><div class='line' id='LC208'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">key</span> <span class="o">=</span> <span class="n">x</span><span class="o">.</span><span class="na">nextValue</span><span class="o">().</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC209'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC210'><br/></div><div class='line' id='LC211'><span class="c1">// The key is followed by &#39;:&#39;.</span></div><div class='line' id='LC212'><br/></div><div class='line' id='LC213'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">c</span> <span class="o">=</span> <span class="n">x</span><span class="o">.</span><span class="na">nextClean</span><span class="o">();</span></div><div class='line' id='LC214'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">!=</span> <span class="sc">&#39;:&#39;</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC215'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="n">x</span><span class="o">.</span><span class="na">syntaxError</span><span class="o">(</span><span class="s">&quot;Expected a &#39;:&#39; after a key&quot;</span><span class="o">);</span></div><div class='line' id='LC216'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC217'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">putOnce</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="n">x</span><span class="o">.</span><span class="na">nextValue</span><span class="o">());</span></div><div class='line' id='LC218'><br/></div><div class='line' id='LC219'><span class="c1">// Pairs are separated by &#39;,&#39;.</span></div><div class='line' id='LC220'><br/></div><div class='line' id='LC221'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">switch</span> <span class="o">(</span><span class="n">x</span><span class="o">.</span><span class="na">nextClean</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC222'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;;&#39;</span><span class="o">:</span></div><div class='line' id='LC223'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;,&#39;</span><span class="o">:</span></div><div class='line' id='LC224'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">x</span><span class="o">.</span><span class="na">nextClean</span><span class="o">()</span> <span class="o">==</span> <span class="sc">&#39;}&#39;</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC225'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC226'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC227'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">x</span><span class="o">.</span><span class="na">back</span><span class="o">();</span></div><div class='line' id='LC228'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC229'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;}&#39;</span><span class="o">:</span></div><div class='line' id='LC230'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC231'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">default</span><span class="o">:</span></div><div class='line' id='LC232'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="n">x</span><span class="o">.</span><span class="na">syntaxError</span><span class="o">(</span><span class="s">&quot;Expected a &#39;,&#39; or &#39;}&#39;&quot;</span><span class="o">);</span></div><div class='line' id='LC233'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC234'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC235'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC236'><br/></div><div class='line' id='LC237'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC238'><span class="cm">     * Construct a JSONObject from a Map.</span></div><div class='line' id='LC239'><span class="cm">     *</span></div><div class='line' id='LC240'><span class="cm">     * @param map</span></div><div class='line' id='LC241'><span class="cm">     *            A map object that can be used to initialize the contents of</span></div><div class='line' id='LC242'><span class="cm">     *            the JSONObject.</span></div><div class='line' id='LC243'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC244'><span class="cm">     */</span></div><div class='line' id='LC245'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONObject</span><span class="o">(</span><span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;</span> <span class="n">map</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC246'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">map</span> <span class="o">=</span> <span class="k">new</span> <span class="n">HashMap</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;();</span></div><div class='line' id='LC247'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">map</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC248'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Iterator</span><span class="o">&lt;</span><span class="n">Entry</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;&gt;</span> <span class="n">i</span> <span class="o">=</span> <span class="n">map</span><span class="o">.</span><span class="na">entrySet</span><span class="o">().</span><span class="na">iterator</span><span class="o">();</span></div><div class='line' id='LC249'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">(</span><span class="n">i</span><span class="o">.</span><span class="na">hasNext</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC250'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Entry</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;</span> <span class="n">entry</span> <span class="o">=</span> <span class="n">i</span><span class="o">.</span><span class="na">next</span><span class="o">();</span></div><div class='line' id='LC251'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">value</span> <span class="o">=</span> <span class="n">entry</span><span class="o">.</span><span class="na">getValue</span><span class="o">();</span></div><div class='line' id='LC252'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC253'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">map</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">entry</span><span class="o">.</span><span class="na">getKey</span><span class="o">(),</span> <span class="n">wrap</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC254'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC255'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC256'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC257'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC258'><br/></div><div class='line' id='LC259'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC260'><span class="cm">     * Construct a JSONObject from an Object using bean getters. It reflects on</span></div><div class='line' id='LC261'><span class="cm">     * all of the public methods of the object. For each of the methods with no</span></div><div class='line' id='LC262'><span class="cm">     * parameters and a name starting with &lt;code&gt;&quot;get&quot;&lt;/code&gt; or</span></div><div class='line' id='LC263'><span class="cm">     * &lt;code&gt;&quot;is&quot;&lt;/code&gt; followed by an uppercase letter, the method is invoked,</span></div><div class='line' id='LC264'><span class="cm">     * and a key and the value returned from the getter method are put into the</span></div><div class='line' id='LC265'><span class="cm">     * new JSONObject.</span></div><div class='line' id='LC266'><span class="cm">     *</span></div><div class='line' id='LC267'><span class="cm">     * The key is formed by removing the &lt;code&gt;&quot;get&quot;&lt;/code&gt; or &lt;code&gt;&quot;is&quot;&lt;/code&gt;</span></div><div class='line' id='LC268'><span class="cm">     * prefix. If the second remaining character is not upper case, then the</span></div><div class='line' id='LC269'><span class="cm">     * first character is converted to lower case.</span></div><div class='line' id='LC270'><span class="cm">     *</span></div><div class='line' id='LC271'><span class="cm">     * For example, if an object has a method named &lt;code&gt;&quot;getName&quot;&lt;/code&gt;, and</span></div><div class='line' id='LC272'><span class="cm">     * if the result of calling &lt;code&gt;object.getName()&lt;/code&gt; is</span></div><div class='line' id='LC273'><span class="cm">     * &lt;code&gt;&quot;Larry Fine&quot;&lt;/code&gt;, then the JSONObject will contain</span></div><div class='line' id='LC274'><span class="cm">     * &lt;code&gt;&quot;name&quot;: &quot;Larry Fine&quot;&lt;/code&gt;.</span></div><div class='line' id='LC275'><span class="cm">     *</span></div><div class='line' id='LC276'><span class="cm">     * @param bean</span></div><div class='line' id='LC277'><span class="cm">     *            An object that has getter methods that should be used to make</span></div><div class='line' id='LC278'><span class="cm">     *            a JSONObject.</span></div><div class='line' id='LC279'><span class="cm">     */</span></div><div class='line' id='LC280'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONObject</span><span class="o">(</span><span class="n">Object</span> <span class="n">bean</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC281'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">();</span></div><div class='line' id='LC282'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">populateMap</span><span class="o">(</span><span class="n">bean</span><span class="o">);</span></div><div class='line' id='LC283'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC284'><br/></div><div class='line' id='LC285'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC286'><span class="cm">     * Construct a JSONObject from an Object, using reflection to find the</span></div><div class='line' id='LC287'><span class="cm">     * public members. The resulting JSONObject&#39;s keys will be the strings from</span></div><div class='line' id='LC288'><span class="cm">     * the names array, and the values will be the field values associated with</span></div><div class='line' id='LC289'><span class="cm">     * those keys in the object. If a key is not found or not visible, then it</span></div><div class='line' id='LC290'><span class="cm">     * will not be copied into the new JSONObject.</span></div><div class='line' id='LC291'><span class="cm">     *</span></div><div class='line' id='LC292'><span class="cm">     * @param object</span></div><div class='line' id='LC293'><span class="cm">     *            An object that has fields that should be used to make a</span></div><div class='line' id='LC294'><span class="cm">     *            JSONObject.</span></div><div class='line' id='LC295'><span class="cm">     * @param names</span></div><div class='line' id='LC296'><span class="cm">     *            An array of strings, the names of the fields to be obtained</span></div><div class='line' id='LC297'><span class="cm">     *            from the object.</span></div><div class='line' id='LC298'><span class="cm">     */</span></div><div class='line' id='LC299'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONObject</span><span class="o">(</span><span class="n">Object</span> <span class="n">object</span><span class="o">,</span> <span class="n">String</span> <span class="n">names</span><span class="o">[])</span> <span class="o">{</span></div><div class='line' id='LC300'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">();</span></div><div class='line' id='LC301'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Class</span> <span class="n">c</span> <span class="o">=</span> <span class="n">object</span><span class="o">.</span><span class="na">getClass</span><span class="o">();</span></div><div class='line' id='LC302'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">names</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC303'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">name</span> <span class="o">=</span> <span class="n">names</span><span class="o">[</span><span class="n">i</span><span class="o">];</span></div><div class='line' id='LC304'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC305'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">putOpt</span><span class="o">(</span><span class="n">name</span><span class="o">,</span> <span class="n">c</span><span class="o">.</span><span class="na">getField</span><span class="o">(</span><span class="n">name</span><span class="o">).</span><span class="na">get</span><span class="o">(</span><span class="n">object</span><span class="o">));</span></div><div class='line' id='LC306'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">ignore</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC307'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC308'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC309'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC310'><br/></div><div class='line' id='LC311'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC312'><span class="cm">     * Construct a JSONObject from a source JSON text string. This is the most</span></div><div class='line' id='LC313'><span class="cm">     * commonly used JSONObject constructor.</span></div><div class='line' id='LC314'><span class="cm">     *</span></div><div class='line' id='LC315'><span class="cm">     * @param source</span></div><div class='line' id='LC316'><span class="cm">     *            A string beginning with &lt;code&gt;{&lt;/code&gt;&amp;nbsp;&lt;small&gt;(left</span></div><div class='line' id='LC317'><span class="cm">     *            brace)&lt;/small&gt; and ending with &lt;code&gt;}&lt;/code&gt;</span></div><div class='line' id='LC318'><span class="cm">     *            &amp;nbsp;&lt;small&gt;(right brace)&lt;/small&gt;.</span></div><div class='line' id='LC319'><span class="cm">     * @exception JSONException</span></div><div class='line' id='LC320'><span class="cm">     *                If there is a syntax error in the source string or a</span></div><div class='line' id='LC321'><span class="cm">     *                duplicated key.</span></div><div class='line' id='LC322'><span class="cm">     */</span></div><div class='line' id='LC323'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONObject</span><span class="o">(</span><span class="n">String</span> <span class="n">source</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC324'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">(</span><span class="k">new</span> <span class="n">JSONTokener</span><span class="o">(</span><span class="n">source</span><span class="o">));</span></div><div class='line' id='LC325'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC326'><br/></div><div class='line' id='LC327'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC328'><span class="cm">     * Construct a JSONObject from a ResourceBundle.</span></div><div class='line' id='LC329'><span class="cm">     *</span></div><div class='line' id='LC330'><span class="cm">     * @param baseName</span></div><div class='line' id='LC331'><span class="cm">     *            The ResourceBundle base name.</span></div><div class='line' id='LC332'><span class="cm">     * @param locale</span></div><div class='line' id='LC333'><span class="cm">     *            The Locale to load the ResourceBundle for.</span></div><div class='line' id='LC334'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC335'><span class="cm">     *             If any JSONExceptions are detected.</span></div><div class='line' id='LC336'><span class="cm">     */</span></div><div class='line' id='LC337'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">JSONObject</span><span class="o">(</span><span class="n">String</span> <span class="n">baseName</span><span class="o">,</span> <span class="n">Locale</span> <span class="n">locale</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC338'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">();</span></div><div class='line' id='LC339'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ResourceBundle</span> <span class="n">bundle</span> <span class="o">=</span> <span class="n">ResourceBundle</span><span class="o">.</span><span class="na">getBundle</span><span class="o">(</span><span class="n">baseName</span><span class="o">,</span> <span class="n">locale</span><span class="o">,</span></div><div class='line' id='LC340'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Thread</span><span class="o">.</span><span class="na">currentThread</span><span class="o">().</span><span class="na">getContextClassLoader</span><span class="o">());</span></div><div class='line' id='LC341'><br/></div><div class='line' id='LC342'><span class="c1">// Iterate through the keys in the bundle.</span></div><div class='line' id='LC343'><br/></div><div class='line' id='LC344'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Enumeration</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">keys</span> <span class="o">=</span> <span class="n">bundle</span><span class="o">.</span><span class="na">getKeys</span><span class="o">();</span></div><div class='line' id='LC345'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">(</span><span class="n">keys</span><span class="o">.</span><span class="na">hasMoreElements</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC346'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">key</span> <span class="o">=</span> <span class="n">keys</span><span class="o">.</span><span class="na">nextElement</span><span class="o">();</span></div><div class='line' id='LC347'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">key</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC348'><br/></div><div class='line' id='LC349'><span class="c1">// Go through the path, ensuring that there is a nested JSONObject for each</span></div><div class='line' id='LC350'><span class="c1">// segment except the last. Add the value using the last segment&#39;s name into</span></div><div class='line' id='LC351'><span class="c1">// the deepest nested JSONObject.</span></div><div class='line' id='LC352'><br/></div><div class='line' id='LC353'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span><span class="o">[]</span> <span class="n">path</span> <span class="o">=</span> <span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">key</span><span class="o">).</span><span class="na">split</span><span class="o">(</span><span class="s">&quot;\\.&quot;</span><span class="o">);</span></div><div class='line' id='LC354'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">last</span> <span class="o">=</span> <span class="n">path</span><span class="o">.</span><span class="na">length</span> <span class="o">-</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC355'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span> <span class="n">target</span> <span class="o">=</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC356'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">last</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC357'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">segment</span> <span class="o">=</span> <span class="n">path</span><span class="o">[</span><span class="n">i</span><span class="o">];</span></div><div class='line' id='LC358'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONObject</span> <span class="n">nextTarget</span> <span class="o">=</span> <span class="n">target</span><span class="o">.</span><span class="na">optJSONObject</span><span class="o">(</span><span class="n">segment</span><span class="o">);</span></div><div class='line' id='LC359'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">nextTarget</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC360'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">nextTarget</span> <span class="o">=</span> <span class="k">new</span> <span class="n">JSONObject</span><span class="o">();</span></div><div class='line' id='LC361'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">target</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">segment</span><span class="o">,</span> <span class="n">nextTarget</span><span class="o">);</span></div><div class='line' id='LC362'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC363'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">target</span> <span class="o">=</span> <span class="n">nextTarget</span><span class="o">;</span></div><div class='line' id='LC364'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC365'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">target</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">path</span><span class="o">[</span><span class="n">last</span><span class="o">],</span> <span class="n">bundle</span><span class="o">.</span><span class="na">getString</span><span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">key</span><span class="o">));</span></div><div class='line' id='LC366'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC367'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC368'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC369'><br/></div><div class='line' id='LC370'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC371'><span class="cm">     * Accumulate values under a key. It is similar to the put method except</span></div><div class='line' id='LC372'><span class="cm">     * that if there is already an object stored under the key then a JSONArray</span></div><div class='line' id='LC373'><span class="cm">     * is stored under the key to hold all of the accumulated values. If there</span></div><div class='line' id='LC374'><span class="cm">     * is already a JSONArray, then the new value is appended to it. In</span></div><div class='line' id='LC375'><span class="cm">     * contrast, the put method replaces the previous value.</span></div><div class='line' id='LC376'><span class="cm">     *</span></div><div class='line' id='LC377'><span class="cm">     * If only one value is accumulated that is not a JSONArray, then the result</span></div><div class='line' id='LC378'><span class="cm">     * will be the same as using put. But if multiple values are accumulated,</span></div><div class='line' id='LC379'><span class="cm">     * then the result will be like append.</span></div><div class='line' id='LC380'><span class="cm">     *</span></div><div class='line' id='LC381'><span class="cm">     * @param key</span></div><div class='line' id='LC382'><span class="cm">     *            A key string.</span></div><div class='line' id='LC383'><span class="cm">     * @param value</span></div><div class='line' id='LC384'><span class="cm">     *            An object to be accumulated under the key.</span></div><div class='line' id='LC385'><span class="cm">     * @return this.</span></div><div class='line' id='LC386'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC387'><span class="cm">     *             If the value is an invalid number or if the key is null.</span></div><div class='line' id='LC388'><span class="cm">     */</span></div><div class='line' id='LC389'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">accumulate</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="n">Object</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC390'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">testValidity</span><span class="o">(</span><span class="n">value</span><span class="o">);</span></div><div class='line' id='LC391'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC392'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC393'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span></div><div class='line' id='LC394'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">value</span> <span class="k">instanceof</span> <span class="n">JSONArray</span> <span class="o">?</span> <span class="k">new</span> <span class="n">JSONArray</span><span class="o">().</span><span class="na">put</span><span class="o">(</span><span class="n">value</span><span class="o">)</span></div><div class='line' id='LC395'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">value</span><span class="o">);</span></div><div class='line' id='LC396'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">JSONArray</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC397'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">((</span><span class="n">JSONArray</span><span class="o">)</span> <span class="n">object</span><span class="o">).</span><span class="na">put</span><span class="o">(</span><span class="n">value</span><span class="o">);</span></div><div class='line' id='LC398'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC399'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="k">new</span> <span class="n">JSONArray</span><span class="o">().</span><span class="na">put</span><span class="o">(</span><span class="n">object</span><span class="o">).</span><span class="na">put</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC400'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC401'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC402'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC403'><br/></div><div class='line' id='LC404'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC405'><span class="cm">     * Append values to the array under a key. If the key does not exist in the</span></div><div class='line' id='LC406'><span class="cm">     * JSONObject, then the key is put in the JSONObject with its value being a</span></div><div class='line' id='LC407'><span class="cm">     * JSONArray containing the value parameter. If the key was already</span></div><div class='line' id='LC408'><span class="cm">     * associated with a JSONArray, then the value parameter is appended to it.</span></div><div class='line' id='LC409'><span class="cm">     *</span></div><div class='line' id='LC410'><span class="cm">     * @param key</span></div><div class='line' id='LC411'><span class="cm">     *            A key string.</span></div><div class='line' id='LC412'><span class="cm">     * @param value</span></div><div class='line' id='LC413'><span class="cm">     *            An object to be accumulated under the key.</span></div><div class='line' id='LC414'><span class="cm">     * @return this.</span></div><div class='line' id='LC415'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC416'><span class="cm">     *             If the key is null or if the current value associated with</span></div><div class='line' id='LC417'><span class="cm">     *             the key is not a JSONArray.</span></div><div class='line' id='LC418'><span class="cm">     */</span></div><div class='line' id='LC419'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">append</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="n">Object</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC420'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">testValidity</span><span class="o">(</span><span class="n">value</span><span class="o">);</span></div><div class='line' id='LC421'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC422'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC423'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="k">new</span> <span class="n">JSONArray</span><span class="o">().</span><span class="na">put</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC424'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">JSONArray</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC425'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="o">((</span><span class="n">JSONArray</span><span class="o">)</span> <span class="n">object</span><span class="o">).</span><span class="na">put</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC426'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC427'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONObject[&quot;</span> <span class="o">+</span> <span class="n">key</span></div><div class='line' id='LC428'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;] is not a JSONArray.&quot;</span><span class="o">);</span></div><div class='line' id='LC429'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC430'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC431'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC432'><br/></div><div class='line' id='LC433'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC434'><span class="cm">     * Produce a string from a double. The string &quot;null&quot; will be returned if the</span></div><div class='line' id='LC435'><span class="cm">     * number is not finite.</span></div><div class='line' id='LC436'><span class="cm">     *</span></div><div class='line' id='LC437'><span class="cm">     * @param d</span></div><div class='line' id='LC438'><span class="cm">     *            A double.</span></div><div class='line' id='LC439'><span class="cm">     * @return A String.</span></div><div class='line' id='LC440'><span class="cm">     */</span></div><div class='line' id='LC441'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span> <span class="nf">doubleToString</span><span class="o">(</span><span class="kt">double</span> <span class="n">d</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC442'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">Double</span><span class="o">.</span><span class="na">isInfinite</span><span class="o">(</span><span class="n">d</span><span class="o">)</span> <span class="o">||</span> <span class="n">Double</span><span class="o">.</span><span class="na">isNaN</span><span class="o">(</span><span class="n">d</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC443'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="s">&quot;null&quot;</span><span class="o">;</span></div><div class='line' id='LC444'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC445'><br/></div><div class='line' id='LC446'><span class="c1">// Shave off trailing zeros and decimal point, if possible.</span></div><div class='line' id='LC447'><br/></div><div class='line' id='LC448'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">string</span> <span class="o">=</span> <span class="n">Double</span><span class="o">.</span><span class="na">toString</span><span class="o">(</span><span class="n">d</span><span class="o">);</span></div><div class='line' id='LC449'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">&#39;.&#39;</span><span class="o">)</span> <span class="o">&gt;</span> <span class="mi">0</span> <span class="o">&amp;&amp;</span> <span class="n">string</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">&#39;e&#39;</span><span class="o">)</span> <span class="o">&lt;</span> <span class="mi">0</span></div><div class='line' id='LC450'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">&amp;&amp;</span> <span class="n">string</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">&#39;E&#39;</span><span class="o">)</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC451'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">endsWith</span><span class="o">(</span><span class="s">&quot;0&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC452'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">string</span> <span class="o">=</span> <span class="n">string</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">string</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">-</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC453'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC454'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">endsWith</span><span class="o">(</span><span class="s">&quot;.&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC455'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">string</span> <span class="o">=</span> <span class="n">string</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">string</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">-</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC456'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC457'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC458'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">string</span><span class="o">;</span></div><div class='line' id='LC459'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC460'><br/></div><div class='line' id='LC461'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC462'><span class="cm">     * Get the value object associated with a key.</span></div><div class='line' id='LC463'><span class="cm">     *</span></div><div class='line' id='LC464'><span class="cm">     * @param key</span></div><div class='line' id='LC465'><span class="cm">     *            A key string.</span></div><div class='line' id='LC466'><span class="cm">     * @return The object associated with the key.</span></div><div class='line' id='LC467'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC468'><span class="cm">     *             if the key is not found.</span></div><div class='line' id='LC469'><span class="cm">     */</span></div><div class='line' id='LC470'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Object</span> <span class="nf">get</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC471'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">key</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC472'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;Null key.&quot;</span><span class="o">);</span></div><div class='line' id='LC473'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC474'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC475'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC476'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONObject[&quot;</span> <span class="o">+</span> <span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">)</span> <span class="o">+</span> <span class="s">&quot;] not found.&quot;</span><span class="o">);</span></div><div class='line' id='LC477'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC478'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC479'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC480'><br/></div><div class='line' id='LC481'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC482'><span class="cm">     * Get the boolean value associated with a key.</span></div><div class='line' id='LC483'><span class="cm">     *</span></div><div class='line' id='LC484'><span class="cm">     * @param key</span></div><div class='line' id='LC485'><span class="cm">     *            A key string.</span></div><div class='line' id='LC486'><span class="cm">     * @return The truth.</span></div><div class='line' id='LC487'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC488'><span class="cm">     *             if the value is not a Boolean or the String &quot;true&quot; or</span></div><div class='line' id='LC489'><span class="cm">     *             &quot;false&quot;.</span></div><div class='line' id='LC490'><span class="cm">     */</span></div><div class='line' id='LC491'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">getBoolean</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC492'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC493'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">Boolean</span><span class="o">.</span><span class="na">FALSE</span><span class="o">)</span></div><div class='line' id='LC494'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">String</span> <span class="o">&amp;&amp;</span> <span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">)</span></div><div class='line' id='LC495'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">equalsIgnoreCase</span><span class="o">(</span><span class="s">&quot;false&quot;</span><span class="o">)))</span> <span class="o">{</span></div><div class='line' id='LC496'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC497'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">object</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">Boolean</span><span class="o">.</span><span class="na">TRUE</span><span class="o">)</span></div><div class='line' id='LC498'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">String</span> <span class="o">&amp;&amp;</span> <span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">)</span></div><div class='line' id='LC499'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">equalsIgnoreCase</span><span class="o">(</span><span class="s">&quot;true&quot;</span><span class="o">)))</span> <span class="o">{</span></div><div class='line' id='LC500'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC501'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC502'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONObject[&quot;</span> <span class="o">+</span> <span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">)</span></div><div class='line' id='LC503'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;] is not a Boolean.&quot;</span><span class="o">);</span></div><div class='line' id='LC504'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC505'><br/></div><div class='line' id='LC506'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC507'><span class="cm">     * Get the double value associated with a key.</span></div><div class='line' id='LC508'><span class="cm">     *</span></div><div class='line' id='LC509'><span class="cm">     * @param key</span></div><div class='line' id='LC510'><span class="cm">     *            A key string.</span></div><div class='line' id='LC511'><span class="cm">     * @return The numeric value.</span></div><div class='line' id='LC512'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC513'><span class="cm">     *             if the key is not found or if the value is not a Number</span></div><div class='line' id='LC514'><span class="cm">     *             object and cannot be converted to a number.</span></div><div class='line' id='LC515'><span class="cm">     */</span></div><div class='line' id='LC516'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">double</span> <span class="nf">getDouble</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC517'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC518'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC519'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Number</span> <span class="o">?</span> <span class="o">((</span><span class="n">Number</span><span class="o">)</span> <span class="n">object</span><span class="o">).</span><span class="na">doubleValue</span><span class="o">()</span></div><div class='line' id='LC520'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">Double</span><span class="o">.</span><span class="na">parseDouble</span><span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">);</span></div><div class='line' id='LC521'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC522'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONObject[&quot;</span> <span class="o">+</span> <span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">)</span></div><div class='line' id='LC523'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;] is not a number.&quot;</span><span class="o">);</span></div><div class='line' id='LC524'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC525'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC526'><br/></div><div class='line' id='LC527'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC528'><span class="cm">     * Get the int value associated with a key.</span></div><div class='line' id='LC529'><span class="cm">     *</span></div><div class='line' id='LC530'><span class="cm">     * @param key</span></div><div class='line' id='LC531'><span class="cm">     *            A key string.</span></div><div class='line' id='LC532'><span class="cm">     * @return The integer value.</span></div><div class='line' id='LC533'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC534'><span class="cm">     *             if the key is not found or if the value cannot be converted</span></div><div class='line' id='LC535'><span class="cm">     *             to an integer.</span></div><div class='line' id='LC536'><span class="cm">     */</span></div><div class='line' id='LC537'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">getInt</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC538'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC539'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC540'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Number</span> <span class="o">?</span> <span class="o">((</span><span class="n">Number</span><span class="o">)</span> <span class="n">object</span><span class="o">).</span><span class="na">intValue</span><span class="o">()</span></div><div class='line' id='LC541'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">Integer</span><span class="o">.</span><span class="na">parseInt</span><span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">);</span></div><div class='line' id='LC542'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC543'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONObject[&quot;</span> <span class="o">+</span> <span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">)</span></div><div class='line' id='LC544'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;] is not an int.&quot;</span><span class="o">);</span></div><div class='line' id='LC545'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC546'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC547'><br/></div><div class='line' id='LC548'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC549'><span class="cm">     * Get the JSONArray value associated with a key.</span></div><div class='line' id='LC550'><span class="cm">     *</span></div><div class='line' id='LC551'><span class="cm">     * @param key</span></div><div class='line' id='LC552'><span class="cm">     *            A key string.</span></div><div class='line' id='LC553'><span class="cm">     * @return A JSONArray which is the value.</span></div><div class='line' id='LC554'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC555'><span class="cm">     *             if the key is not found or if the value is not a JSONArray.</span></div><div class='line' id='LC556'><span class="cm">     */</span></div><div class='line' id='LC557'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">getJSONArray</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC558'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC559'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">JSONArray</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC560'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">(</span><span class="n">JSONArray</span><span class="o">)</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC561'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC562'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONObject[&quot;</span> <span class="o">+</span> <span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">)</span></div><div class='line' id='LC563'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;] is not a JSONArray.&quot;</span><span class="o">);</span></div><div class='line' id='LC564'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC565'><br/></div><div class='line' id='LC566'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC567'><span class="cm">     * Get the JSONObject value associated with a key.</span></div><div class='line' id='LC568'><span class="cm">     *</span></div><div class='line' id='LC569'><span class="cm">     * @param key</span></div><div class='line' id='LC570'><span class="cm">     *            A key string.</span></div><div class='line' id='LC571'><span class="cm">     * @return A JSONObject which is the value.</span></div><div class='line' id='LC572'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC573'><span class="cm">     *             if the key is not found or if the value is not a JSONObject.</span></div><div class='line' id='LC574'><span class="cm">     */</span></div><div class='line' id='LC575'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">getJSONObject</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC576'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC577'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">JSONObject</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC578'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">(</span><span class="n">JSONObject</span><span class="o">)</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC579'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC580'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONObject[&quot;</span> <span class="o">+</span> <span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">)</span></div><div class='line' id='LC581'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;] is not a JSONObject.&quot;</span><span class="o">);</span></div><div class='line' id='LC582'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC583'><br/></div><div class='line' id='LC584'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC585'><span class="cm">     * Get the long value associated with a key.</span></div><div class='line' id='LC586'><span class="cm">     *</span></div><div class='line' id='LC587'><span class="cm">     * @param key</span></div><div class='line' id='LC588'><span class="cm">     *            A key string.</span></div><div class='line' id='LC589'><span class="cm">     * @return The long value.</span></div><div class='line' id='LC590'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC591'><span class="cm">     *             if the key is not found or if the value cannot be converted</span></div><div class='line' id='LC592'><span class="cm">     *             to a long.</span></div><div class='line' id='LC593'><span class="cm">     */</span></div><div class='line' id='LC594'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">long</span> <span class="nf">getLong</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC595'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC596'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC597'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Number</span> <span class="o">?</span> <span class="o">((</span><span class="n">Number</span><span class="o">)</span> <span class="n">object</span><span class="o">).</span><span class="na">longValue</span><span class="o">()</span></div><div class='line' id='LC598'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">Long</span><span class="o">.</span><span class="na">parseLong</span><span class="o">((</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">);</span></div><div class='line' id='LC599'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC600'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONObject[&quot;</span> <span class="o">+</span> <span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">)</span></div><div class='line' id='LC601'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="s">&quot;] is not a long.&quot;</span><span class="o">);</span></div><div class='line' id='LC602'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC603'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC604'><br/></div><div class='line' id='LC605'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC606'><span class="cm">     * Get an array of field names from a JSONObject.</span></div><div class='line' id='LC607'><span class="cm">     *</span></div><div class='line' id='LC608'><span class="cm">     * @return An array of field names, or null if there are no names.</span></div><div class='line' id='LC609'><span class="cm">     */</span></div><div class='line' id='LC610'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span><span class="o">[]</span> <span class="nf">getNames</span><span class="o">(</span><span class="n">JSONObject</span> <span class="n">jo</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC611'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">length</span> <span class="o">=</span> <span class="n">jo</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></div><div class='line' id='LC612'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">length</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC613'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC614'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC615'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Iterator</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">iterator</span> <span class="o">=</span> <span class="n">jo</span><span class="o">.</span><span class="na">keys</span><span class="o">();</span></div><div class='line' id='LC616'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span><span class="o">[]</span> <span class="n">names</span> <span class="o">=</span> <span class="k">new</span> <span class="n">String</span><span class="o">[</span><span class="n">length</span><span class="o">];</span></div><div class='line' id='LC617'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC618'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">(</span><span class="n">iterator</span><span class="o">.</span><span class="na">hasNext</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC619'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">names</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">=</span> <span class="n">iterator</span><span class="o">.</span><span class="na">next</span><span class="o">();</span></div><div class='line' id='LC620'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC621'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC622'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">names</span><span class="o">;</span></div><div class='line' id='LC623'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC624'><br/></div><div class='line' id='LC625'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC626'><span class="cm">     * Get an array of field names from an Object.</span></div><div class='line' id='LC627'><span class="cm">     *</span></div><div class='line' id='LC628'><span class="cm">     * @return An array of field names, or null if there are no names.</span></div><div class='line' id='LC629'><span class="cm">     */</span></div><div class='line' id='LC630'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span><span class="o">[]</span> <span class="nf">getNames</span><span class="o">(</span><span class="n">Object</span> <span class="n">object</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC631'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC632'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC633'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC634'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Class</span> <span class="n">klass</span> <span class="o">=</span> <span class="n">object</span><span class="o">.</span><span class="na">getClass</span><span class="o">();</span></div><div class='line' id='LC635'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Field</span><span class="o">[]</span> <span class="n">fields</span> <span class="o">=</span> <span class="n">klass</span><span class="o">.</span><span class="na">getFields</span><span class="o">();</span></div><div class='line' id='LC636'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">length</span> <span class="o">=</span> <span class="n">fields</span><span class="o">.</span><span class="na">length</span><span class="o">;</span></div><div class='line' id='LC637'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">length</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC638'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC639'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC640'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span><span class="o">[]</span> <span class="n">names</span> <span class="o">=</span> <span class="k">new</span> <span class="n">String</span><span class="o">[</span><span class="n">length</span><span class="o">];</span></div><div class='line' id='LC641'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">length</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC642'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">names</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">=</span> <span class="n">fields</span><span class="o">[</span><span class="n">i</span><span class="o">].</span><span class="na">getName</span><span class="o">();</span></div><div class='line' id='LC643'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC644'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">names</span><span class="o">;</span></div><div class='line' id='LC645'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC646'><br/></div><div class='line' id='LC647'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC648'><span class="cm">     * Get the string associated with a key.</span></div><div class='line' id='LC649'><span class="cm">     *</span></div><div class='line' id='LC650'><span class="cm">     * @param key</span></div><div class='line' id='LC651'><span class="cm">     *            A key string.</span></div><div class='line' id='LC652'><span class="cm">     * @return A string which is the value.</span></div><div class='line' id='LC653'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC654'><span class="cm">     *             if there is no string value for the key.</span></div><div class='line' id='LC655'><span class="cm">     */</span></div><div class='line' id='LC656'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">getString</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC657'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC658'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">String</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC659'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">(</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC660'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC661'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;JSONObject[&quot;</span> <span class="o">+</span> <span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">)</span> <span class="o">+</span> <span class="s">&quot;] not a string.&quot;</span><span class="o">);</span></div><div class='line' id='LC662'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC663'><br/></div><div class='line' id='LC664'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC665'><span class="cm">     * Determine if the JSONObject contains a specific key.</span></div><div class='line' id='LC666'><span class="cm">     *</span></div><div class='line' id='LC667'><span class="cm">     * @param key</span></div><div class='line' id='LC668'><span class="cm">     *            A key string.</span></div><div class='line' id='LC669'><span class="cm">     * @return true if the key exists in the JSONObject.</span></div><div class='line' id='LC670'><span class="cm">     */</span></div><div class='line' id='LC671'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">has</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC672'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">map</span><span class="o">.</span><span class="na">containsKey</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC673'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC674'><br/></div><div class='line' id='LC675'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC676'><span class="cm">     * Increment a property of a JSONObject. If there is no such property,</span></div><div class='line' id='LC677'><span class="cm">     * create one with a value of 1. If there is such a property, and if it is</span></div><div class='line' id='LC678'><span class="cm">     * an Integer, Long, Double, or Float, then add one to it.</span></div><div class='line' id='LC679'><span class="cm">     *</span></div><div class='line' id='LC680'><span class="cm">     * @param key</span></div><div class='line' id='LC681'><span class="cm">     *            A key string.</span></div><div class='line' id='LC682'><span class="cm">     * @return this.</span></div><div class='line' id='LC683'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC684'><span class="cm">     *             If there is already a property with this name that is not an</span></div><div class='line' id='LC685'><span class="cm">     *             Integer, Long, Double, or Float.</span></div><div class='line' id='LC686'><span class="cm">     */</span></div><div class='line' id='LC687'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">increment</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC688'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">value</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC689'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC690'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC691'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Integer</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC692'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="o">(</span><span class="n">Integer</span><span class="o">)</span> <span class="n">value</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC693'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Long</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC694'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="o">(</span><span class="n">Long</span><span class="o">)</span> <span class="n">value</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC695'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Double</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC696'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="o">(</span><span class="n">Double</span><span class="o">)</span> <span class="n">value</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC697'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Float</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC698'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="o">(</span><span class="n">Float</span><span class="o">)</span> <span class="n">value</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC699'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC700'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;Unable to increment [&quot;</span> <span class="o">+</span> <span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">)</span> <span class="o">+</span> <span class="s">&quot;].&quot;</span><span class="o">);</span></div><div class='line' id='LC701'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC702'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC703'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC704'><br/></div><div class='line' id='LC705'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC706'><span class="cm">     * Determine if the value associated with the key is null or if there is no</span></div><div class='line' id='LC707'><span class="cm">     * value.</span></div><div class='line' id='LC708'><span class="cm">     *</span></div><div class='line' id='LC709'><span class="cm">     * @param key</span></div><div class='line' id='LC710'><span class="cm">     *            A key string.</span></div><div class='line' id='LC711'><span class="cm">     * @return true if there is no value associated with the key or if the value</span></div><div class='line' id='LC712'><span class="cm">     *         is the JSONObject.NULL object.</span></div><div class='line' id='LC713'><span class="cm">     */</span></div><div class='line' id='LC714'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isNull</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC715'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">JSONObject</span><span class="o">.</span><span class="na">NULL</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">key</span><span class="o">));</span></div><div class='line' id='LC716'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC717'><br/></div><div class='line' id='LC718'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC719'><span class="cm">     * Get an enumeration of the keys of the JSONObject.</span></div><div class='line' id='LC720'><span class="cm">     *</span></div><div class='line' id='LC721'><span class="cm">     * @return An iterator of the keys.</span></div><div class='line' id='LC722'><span class="cm">     */</span></div><div class='line' id='LC723'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Iterator</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="nf">keys</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC724'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">keySet</span><span class="o">().</span><span class="na">iterator</span><span class="o">();</span></div><div class='line' id='LC725'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC726'><br/></div><div class='line' id='LC727'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC728'><span class="cm">     * Get a set of keys of the JSONObject.</span></div><div class='line' id='LC729'><span class="cm">     *</span></div><div class='line' id='LC730'><span class="cm">     * @return A keySet.</span></div><div class='line' id='LC731'><span class="cm">     */</span></div><div class='line' id='LC732'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Set</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="nf">keySet</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC733'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">map</span><span class="o">.</span><span class="na">keySet</span><span class="o">();</span></div><div class='line' id='LC734'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC735'><br/></div><div class='line' id='LC736'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC737'><span class="cm">     * Get the number of keys stored in the JSONObject.</span></div><div class='line' id='LC738'><span class="cm">     *</span></div><div class='line' id='LC739'><span class="cm">     * @return The number of keys in the JSONObject.</span></div><div class='line' id='LC740'><span class="cm">     */</span></div><div class='line' id='LC741'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">length</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC742'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">map</span><span class="o">.</span><span class="na">size</span><span class="o">();</span></div><div class='line' id='LC743'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC744'><br/></div><div class='line' id='LC745'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC746'><span class="cm">     * Produce a JSONArray containing the names of the elements of this</span></div><div class='line' id='LC747'><span class="cm">     * JSONObject.</span></div><div class='line' id='LC748'><span class="cm">     *</span></div><div class='line' id='LC749'><span class="cm">     * @return A JSONArray containing the key strings, or null if the JSONObject</span></div><div class='line' id='LC750'><span class="cm">     *         is empty.</span></div><div class='line' id='LC751'><span class="cm">     */</span></div><div class='line' id='LC752'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">names</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC753'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONArray</span> <span class="n">ja</span> <span class="o">=</span> <span class="k">new</span> <span class="n">JSONArray</span><span class="o">();</span></div><div class='line' id='LC754'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Iterator</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">keys</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">keys</span><span class="o">();</span></div><div class='line' id='LC755'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">(</span><span class="n">keys</span><span class="o">.</span><span class="na">hasNext</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC756'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ja</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">keys</span><span class="o">.</span><span class="na">next</span><span class="o">());</span></div><div class='line' id='LC757'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC758'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">ja</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">==</span> <span class="mi">0</span> <span class="o">?</span> <span class="kc">null</span> <span class="o">:</span> <span class="n">ja</span><span class="o">;</span></div><div class='line' id='LC759'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC760'><br/></div><div class='line' id='LC761'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC762'><span class="cm">     * Produce a string from a Number.</span></div><div class='line' id='LC763'><span class="cm">     *</span></div><div class='line' id='LC764'><span class="cm">     * @param number</span></div><div class='line' id='LC765'><span class="cm">     *            A Number</span></div><div class='line' id='LC766'><span class="cm">     * @return A String.</span></div><div class='line' id='LC767'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC768'><span class="cm">     *             If n is a non-finite number.</span></div><div class='line' id='LC769'><span class="cm">     */</span></div><div class='line' id='LC770'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span> <span class="nf">numberToString</span><span class="o">(</span><span class="n">Number</span> <span class="n">number</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC771'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">number</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC772'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;Null pointer&quot;</span><span class="o">);</span></div><div class='line' id='LC773'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC774'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">testValidity</span><span class="o">(</span><span class="n">number</span><span class="o">);</span></div><div class='line' id='LC775'><br/></div><div class='line' id='LC776'><span class="c1">// Shave off trailing zeros and decimal point, if possible.</span></div><div class='line' id='LC777'><br/></div><div class='line' id='LC778'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">string</span> <span class="o">=</span> <span class="n">number</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC779'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">&#39;.&#39;</span><span class="o">)</span> <span class="o">&gt;</span> <span class="mi">0</span> <span class="o">&amp;&amp;</span> <span class="n">string</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">&#39;e&#39;</span><span class="o">)</span> <span class="o">&lt;</span> <span class="mi">0</span></div><div class='line' id='LC780'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">&amp;&amp;</span> <span class="n">string</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">&#39;E&#39;</span><span class="o">)</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC781'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">endsWith</span><span class="o">(</span><span class="s">&quot;0&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC782'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">string</span> <span class="o">=</span> <span class="n">string</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">string</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">-</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC783'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC784'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">endsWith</span><span class="o">(</span><span class="s">&quot;.&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC785'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">string</span> <span class="o">=</span> <span class="n">string</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">string</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">-</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC786'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC787'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC788'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">string</span><span class="o">;</span></div><div class='line' id='LC789'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC790'><br/></div><div class='line' id='LC791'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC792'><span class="cm">     * Get an optional value associated with a key.</span></div><div class='line' id='LC793'><span class="cm">     *</span></div><div class='line' id='LC794'><span class="cm">     * @param key</span></div><div class='line' id='LC795'><span class="cm">     *            A key string.</span></div><div class='line' id='LC796'><span class="cm">     * @return An object which is the value, or null if there is no value.</span></div><div class='line' id='LC797'><span class="cm">     */</span></div><div class='line' id='LC798'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Object</span> <span class="nf">opt</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC799'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">key</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">?</span> <span class="kc">null</span> <span class="o">:</span> <span class="k">this</span><span class="o">.</span><span class="na">map</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC800'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC801'><br/></div><div class='line' id='LC802'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC803'><span class="cm">     * Get an optional boolean associated with a key. It returns false if there</span></div><div class='line' id='LC804'><span class="cm">     * is no such key, or if the value is not Boolean.TRUE or the String &quot;true&quot;.</span></div><div class='line' id='LC805'><span class="cm">     *</span></div><div class='line' id='LC806'><span class="cm">     * @param key</span></div><div class='line' id='LC807'><span class="cm">     *            A key string.</span></div><div class='line' id='LC808'><span class="cm">     * @return The truth.</span></div><div class='line' id='LC809'><span class="cm">     */</span></div><div class='line' id='LC810'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">optBoolean</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC811'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">optBoolean</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="kc">false</span><span class="o">);</span></div><div class='line' id='LC812'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC813'><br/></div><div class='line' id='LC814'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC815'><span class="cm">     * Get an optional boolean associated with a key. It returns the</span></div><div class='line' id='LC816'><span class="cm">     * defaultValue if there is no such key, or if it is not a Boolean or the</span></div><div class='line' id='LC817'><span class="cm">     * String &quot;true&quot; or &quot;false&quot; (case insensitive).</span></div><div class='line' id='LC818'><span class="cm">     *</span></div><div class='line' id='LC819'><span class="cm">     * @param key</span></div><div class='line' id='LC820'><span class="cm">     *            A key string.</span></div><div class='line' id='LC821'><span class="cm">     * @param defaultValue</span></div><div class='line' id='LC822'><span class="cm">     *            The default.</span></div><div class='line' id='LC823'><span class="cm">     * @return The truth.</span></div><div class='line' id='LC824'><span class="cm">     */</span></div><div class='line' id='LC825'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">optBoolean</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">defaultValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC826'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC827'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">getBoolean</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC828'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC829'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">defaultValue</span><span class="o">;</span></div><div class='line' id='LC830'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC831'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC832'><br/></div><div class='line' id='LC833'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC834'><span class="cm">     * Get an optional double associated with a key, or NaN if there is no such</span></div><div class='line' id='LC835'><span class="cm">     * key or if its value is not a number. If the value is a string, an attempt</span></div><div class='line' id='LC836'><span class="cm">     * will be made to evaluate it as a number.</span></div><div class='line' id='LC837'><span class="cm">     *</span></div><div class='line' id='LC838'><span class="cm">     * @param key</span></div><div class='line' id='LC839'><span class="cm">     *            A string which is the key.</span></div><div class='line' id='LC840'><span class="cm">     * @return An object which is the value.</span></div><div class='line' id='LC841'><span class="cm">     */</span></div><div class='line' id='LC842'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">double</span> <span class="nf">optDouble</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC843'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">optDouble</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="n">Double</span><span class="o">.</span><span class="na">NaN</span><span class="o">);</span></div><div class='line' id='LC844'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC845'><br/></div><div class='line' id='LC846'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC847'><span class="cm">     * Get an optional double associated with a key, or the defaultValue if</span></div><div class='line' id='LC848'><span class="cm">     * there is no such key or if its value is not a number. If the value is a</span></div><div class='line' id='LC849'><span class="cm">     * string, an attempt will be made to evaluate it as a number.</span></div><div class='line' id='LC850'><span class="cm">     *</span></div><div class='line' id='LC851'><span class="cm">     * @param key</span></div><div class='line' id='LC852'><span class="cm">     *            A key string.</span></div><div class='line' id='LC853'><span class="cm">     * @param defaultValue</span></div><div class='line' id='LC854'><span class="cm">     *            The default.</span></div><div class='line' id='LC855'><span class="cm">     * @return An object which is the value.</span></div><div class='line' id='LC856'><span class="cm">     */</span></div><div class='line' id='LC857'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">double</span> <span class="nf">optDouble</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="kt">double</span> <span class="n">defaultValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC858'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC859'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">getDouble</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC860'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC861'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">defaultValue</span><span class="o">;</span></div><div class='line' id='LC862'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC863'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC864'><br/></div><div class='line' id='LC865'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC866'><span class="cm">     * Get an optional int value associated with a key, or zero if there is no</span></div><div class='line' id='LC867'><span class="cm">     * such key or if the value is not a number. If the value is a string, an</span></div><div class='line' id='LC868'><span class="cm">     * attempt will be made to evaluate it as a number.</span></div><div class='line' id='LC869'><span class="cm">     *</span></div><div class='line' id='LC870'><span class="cm">     * @param key</span></div><div class='line' id='LC871'><span class="cm">     *            A key string.</span></div><div class='line' id='LC872'><span class="cm">     * @return An object which is the value.</span></div><div class='line' id='LC873'><span class="cm">     */</span></div><div class='line' id='LC874'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">optInt</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC875'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">optInt</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC876'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC877'><br/></div><div class='line' id='LC878'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC879'><span class="cm">     * Get an optional int value associated with a key, or the default if there</span></div><div class='line' id='LC880'><span class="cm">     * is no such key or if the value is not a number. If the value is a string,</span></div><div class='line' id='LC881'><span class="cm">     * an attempt will be made to evaluate it as a number.</span></div><div class='line' id='LC882'><span class="cm">     *</span></div><div class='line' id='LC883'><span class="cm">     * @param key</span></div><div class='line' id='LC884'><span class="cm">     *            A key string.</span></div><div class='line' id='LC885'><span class="cm">     * @param defaultValue</span></div><div class='line' id='LC886'><span class="cm">     *            The default.</span></div><div class='line' id='LC887'><span class="cm">     * @return An object which is the value.</span></div><div class='line' id='LC888'><span class="cm">     */</span></div><div class='line' id='LC889'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">optInt</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="kt">int</span> <span class="n">defaultValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC890'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC891'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">getInt</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC892'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC893'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">defaultValue</span><span class="o">;</span></div><div class='line' id='LC894'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC895'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC896'><br/></div><div class='line' id='LC897'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC898'><span class="cm">     * Get an optional JSONArray associated with a key. It returns null if there</span></div><div class='line' id='LC899'><span class="cm">     * is no such key, or if its value is not a JSONArray.</span></div><div class='line' id='LC900'><span class="cm">     *</span></div><div class='line' id='LC901'><span class="cm">     * @param key</span></div><div class='line' id='LC902'><span class="cm">     *            A key string.</span></div><div class='line' id='LC903'><span class="cm">     * @return A JSONArray which is the value.</span></div><div class='line' id='LC904'><span class="cm">     */</span></div><div class='line' id='LC905'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">optJSONArray</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC906'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">o</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC907'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">o</span> <span class="k">instanceof</span> <span class="n">JSONArray</span> <span class="o">?</span> <span class="o">(</span><span class="n">JSONArray</span><span class="o">)</span> <span class="n">o</span> <span class="o">:</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC908'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC909'><br/></div><div class='line' id='LC910'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC911'><span class="cm">     * Get an optional JSONObject associated with a key. It returns null if</span></div><div class='line' id='LC912'><span class="cm">     * there is no such key, or if its value is not a JSONObject.</span></div><div class='line' id='LC913'><span class="cm">     *</span></div><div class='line' id='LC914'><span class="cm">     * @param key</span></div><div class='line' id='LC915'><span class="cm">     *            A key string.</span></div><div class='line' id='LC916'><span class="cm">     * @return A JSONObject which is the value.</span></div><div class='line' id='LC917'><span class="cm">     */</span></div><div class='line' id='LC918'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">optJSONObject</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC919'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC920'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">JSONObject</span> <span class="o">?</span> <span class="o">(</span><span class="n">JSONObject</span><span class="o">)</span> <span class="n">object</span> <span class="o">:</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC921'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC922'><br/></div><div class='line' id='LC923'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC924'><span class="cm">     * Get an optional long value associated with a key, or zero if there is no</span></div><div class='line' id='LC925'><span class="cm">     * such key or if the value is not a number. If the value is a string, an</span></div><div class='line' id='LC926'><span class="cm">     * attempt will be made to evaluate it as a number.</span></div><div class='line' id='LC927'><span class="cm">     *</span></div><div class='line' id='LC928'><span class="cm">     * @param key</span></div><div class='line' id='LC929'><span class="cm">     *            A key string.</span></div><div class='line' id='LC930'><span class="cm">     * @return An object which is the value.</span></div><div class='line' id='LC931'><span class="cm">     */</span></div><div class='line' id='LC932'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">long</span> <span class="nf">optLong</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC933'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">optLong</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC934'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC935'><br/></div><div class='line' id='LC936'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC937'><span class="cm">     * Get an optional long value associated with a key, or the default if there</span></div><div class='line' id='LC938'><span class="cm">     * is no such key or if the value is not a number. If the value is a string,</span></div><div class='line' id='LC939'><span class="cm">     * an attempt will be made to evaluate it as a number.</span></div><div class='line' id='LC940'><span class="cm">     *</span></div><div class='line' id='LC941'><span class="cm">     * @param key</span></div><div class='line' id='LC942'><span class="cm">     *            A key string.</span></div><div class='line' id='LC943'><span class="cm">     * @param defaultValue</span></div><div class='line' id='LC944'><span class="cm">     *            The default.</span></div><div class='line' id='LC945'><span class="cm">     * @return An object which is the value.</span></div><div class='line' id='LC946'><span class="cm">     */</span></div><div class='line' id='LC947'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">long</span> <span class="nf">optLong</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="kt">long</span> <span class="n">defaultValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC948'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC949'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">getLong</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC950'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC951'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">defaultValue</span><span class="o">;</span></div><div class='line' id='LC952'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC953'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC954'><br/></div><div class='line' id='LC955'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC956'><span class="cm">     * Get an optional string associated with a key. It returns an empty string</span></div><div class='line' id='LC957'><span class="cm">     * if there is no such key. If the value is not a string and is not null,</span></div><div class='line' id='LC958'><span class="cm">     * then it is converted to a string.</span></div><div class='line' id='LC959'><span class="cm">     *</span></div><div class='line' id='LC960'><span class="cm">     * @param key</span></div><div class='line' id='LC961'><span class="cm">     *            A key string.</span></div><div class='line' id='LC962'><span class="cm">     * @return A string which is the value.</span></div><div class='line' id='LC963'><span class="cm">     */</span></div><div class='line' id='LC964'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">optString</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC965'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">optString</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="s">&quot;&quot;</span><span class="o">);</span></div><div class='line' id='LC966'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC967'><br/></div><div class='line' id='LC968'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC969'><span class="cm">     * Get an optional string associated with a key. It returns the defaultValue</span></div><div class='line' id='LC970'><span class="cm">     * if there is no such key.</span></div><div class='line' id='LC971'><span class="cm">     *</span></div><div class='line' id='LC972'><span class="cm">     * @param key</span></div><div class='line' id='LC973'><span class="cm">     *            A key string.</span></div><div class='line' id='LC974'><span class="cm">     * @param defaultValue</span></div><div class='line' id='LC975'><span class="cm">     *            The default.</span></div><div class='line' id='LC976'><span class="cm">     * @return A string which is the value.</span></div><div class='line' id='LC977'><span class="cm">     */</span></div><div class='line' id='LC978'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">optString</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="n">String</span> <span class="n">defaultValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC979'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC980'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">NULL</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">object</span><span class="o">)</span> <span class="o">?</span> <span class="n">defaultValue</span> <span class="o">:</span> <span class="n">object</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC981'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC982'><br/></div><div class='line' id='LC983'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">populateMap</span><span class="o">(</span><span class="n">Object</span> <span class="n">bean</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC984'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Class</span> <span class="n">klass</span> <span class="o">=</span> <span class="n">bean</span><span class="o">.</span><span class="na">getClass</span><span class="o">();</span></div><div class='line' id='LC985'><br/></div><div class='line' id='LC986'><span class="c1">// If klass is a System class then set includeSuperClass to false.</span></div><div class='line' id='LC987'><br/></div><div class='line' id='LC988'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">includeSuperClass</span> <span class="o">=</span> <span class="n">klass</span><span class="o">.</span><span class="na">getClassLoader</span><span class="o">()</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC989'><br/></div><div class='line' id='LC990'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Method</span><span class="o">[]</span> <span class="n">methods</span> <span class="o">=</span> <span class="n">includeSuperClass</span> <span class="o">?</span> <span class="n">klass</span><span class="o">.</span><span class="na">getMethods</span><span class="o">()</span> <span class="o">:</span> <span class="n">klass</span></div><div class='line' id='LC991'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">getDeclaredMethods</span><span class="o">();</span></div><div class='line' id='LC992'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">methods</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC993'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC994'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Method</span> <span class="n">method</span> <span class="o">=</span> <span class="n">methods</span><span class="o">[</span><span class="n">i</span><span class="o">];</span></div><div class='line' id='LC995'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">Modifier</span><span class="o">.</span><span class="na">isPublic</span><span class="o">(</span><span class="n">method</span><span class="o">.</span><span class="na">getModifiers</span><span class="o">()))</span> <span class="o">{</span></div><div class='line' id='LC996'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">name</span> <span class="o">=</span> <span class="n">method</span><span class="o">.</span><span class="na">getName</span><span class="o">();</span></div><div class='line' id='LC997'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">key</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC998'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">name</span><span class="o">.</span><span class="na">startsWith</span><span class="o">(</span><span class="s">&quot;get&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC999'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="s">&quot;getClass&quot;</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">name</span><span class="o">)</span></div><div class='line' id='LC1000'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="s">&quot;getDeclaringClass&quot;</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">name</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1001'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">key</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC1002'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC1003'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">key</span> <span class="o">=</span> <span class="n">name</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">3</span><span class="o">);</span></div><div class='line' id='LC1004'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1005'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">name</span><span class="o">.</span><span class="na">startsWith</span><span class="o">(</span><span class="s">&quot;is&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1006'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">key</span> <span class="o">=</span> <span class="n">name</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">2</span><span class="o">);</span></div><div class='line' id='LC1007'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1008'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">key</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">&gt;</span> <span class="mi">0</span></div><div class='line' id='LC1009'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">&amp;&amp;</span> <span class="n">Character</span><span class="o">.</span><span class="na">isUpperCase</span><span class="o">(</span><span class="n">key</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="mi">0</span><span class="o">))</span></div><div class='line' id='LC1010'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">&amp;&amp;</span> <span class="n">method</span><span class="o">.</span><span class="na">getParameterTypes</span><span class="o">().</span><span class="na">length</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1011'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">key</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">==</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1012'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">key</span> <span class="o">=</span> <span class="n">key</span><span class="o">.</span><span class="na">toLowerCase</span><span class="o">();</span></div><div class='line' id='LC1013'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(!</span><span class="n">Character</span><span class="o">.</span><span class="na">isUpperCase</span><span class="o">(</span><span class="n">key</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="mi">1</span><span class="o">)))</span> <span class="o">{</span></div><div class='line' id='LC1014'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">key</span> <span class="o">=</span> <span class="n">key</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="mi">1</span><span class="o">).</span><span class="na">toLowerCase</span><span class="o">()</span></div><div class='line' id='LC1015'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">key</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC1016'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1017'><br/></div><div class='line' id='LC1018'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">result</span> <span class="o">=</span> <span class="n">method</span><span class="o">.</span><span class="na">invoke</span><span class="o">(</span><span class="n">bean</span><span class="o">,</span> <span class="o">(</span><span class="n">Object</span><span class="o">[])</span> <span class="kc">null</span><span class="o">);</span></div><div class='line' id='LC1019'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">result</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1020'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">map</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="n">wrap</span><span class="o">(</span><span class="n">result</span><span class="o">));</span></div><div class='line' id='LC1021'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1022'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1023'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1024'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">ignore</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1025'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1026'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1027'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1028'><br/></div><div class='line' id='LC1029'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1030'><span class="cm">     * Put a key/boolean pair in the JSONObject.</span></div><div class='line' id='LC1031'><span class="cm">     *</span></div><div class='line' id='LC1032'><span class="cm">     * @param key</span></div><div class='line' id='LC1033'><span class="cm">     *            A key string.</span></div><div class='line' id='LC1034'><span class="cm">     * @param value</span></div><div class='line' id='LC1035'><span class="cm">     *            A boolean which is the value.</span></div><div class='line' id='LC1036'><span class="cm">     * @return this.</span></div><div class='line' id='LC1037'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1038'><span class="cm">     *             If the key is null.</span></div><div class='line' id='LC1039'><span class="cm">     */</span></div><div class='line' id='LC1040'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">put</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1041'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="n">value</span> <span class="o">?</span> <span class="n">Boolean</span><span class="o">.</span><span class="na">TRUE</span> <span class="o">:</span> <span class="n">Boolean</span><span class="o">.</span><span class="na">FALSE</span><span class="o">);</span></div><div class='line' id='LC1042'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC1043'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1044'><br/></div><div class='line' id='LC1045'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1046'><span class="cm">     * Put a key/value pair in the JSONObject, where the value will be a</span></div><div class='line' id='LC1047'><span class="cm">     * JSONArray which is produced from a Collection.</span></div><div class='line' id='LC1048'><span class="cm">     *</span></div><div class='line' id='LC1049'><span class="cm">     * @param key</span></div><div class='line' id='LC1050'><span class="cm">     *            A key string.</span></div><div class='line' id='LC1051'><span class="cm">     * @param value</span></div><div class='line' id='LC1052'><span class="cm">     *            A Collection value.</span></div><div class='line' id='LC1053'><span class="cm">     * @return this.</span></div><div class='line' id='LC1054'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1055'><span class="cm">     */</span></div><div class='line' id='LC1056'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">put</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="n">Collection</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1057'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="k">new</span> <span class="n">JSONArray</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC1058'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC1059'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1060'><br/></div><div class='line' id='LC1061'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1062'><span class="cm">     * Put a key/double pair in the JSONObject.</span></div><div class='line' id='LC1063'><span class="cm">     *</span></div><div class='line' id='LC1064'><span class="cm">     * @param key</span></div><div class='line' id='LC1065'><span class="cm">     *            A key string.</span></div><div class='line' id='LC1066'><span class="cm">     * @param value</span></div><div class='line' id='LC1067'><span class="cm">     *            A double which is the value.</span></div><div class='line' id='LC1068'><span class="cm">     * @return this.</span></div><div class='line' id='LC1069'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1070'><span class="cm">     *             If the key is null or if the number is invalid.</span></div><div class='line' id='LC1071'><span class="cm">     */</span></div><div class='line' id='LC1072'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">put</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="kt">double</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1073'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="k">new</span> <span class="n">Double</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC1074'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC1075'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1076'><br/></div><div class='line' id='LC1077'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1078'><span class="cm">     * Put a key/int pair in the JSONObject.</span></div><div class='line' id='LC1079'><span class="cm">     *</span></div><div class='line' id='LC1080'><span class="cm">     * @param key</span></div><div class='line' id='LC1081'><span class="cm">     *            A key string.</span></div><div class='line' id='LC1082'><span class="cm">     * @param value</span></div><div class='line' id='LC1083'><span class="cm">     *            An int which is the value.</span></div><div class='line' id='LC1084'><span class="cm">     * @return this.</span></div><div class='line' id='LC1085'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1086'><span class="cm">     *             If the key is null.</span></div><div class='line' id='LC1087'><span class="cm">     */</span></div><div class='line' id='LC1088'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">put</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="kt">int</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1089'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="k">new</span> <span class="n">Integer</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC1090'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC1091'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1092'><br/></div><div class='line' id='LC1093'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1094'><span class="cm">     * Put a key/long pair in the JSONObject.</span></div><div class='line' id='LC1095'><span class="cm">     *</span></div><div class='line' id='LC1096'><span class="cm">     * @param key</span></div><div class='line' id='LC1097'><span class="cm">     *            A key string.</span></div><div class='line' id='LC1098'><span class="cm">     * @param value</span></div><div class='line' id='LC1099'><span class="cm">     *            A long which is the value.</span></div><div class='line' id='LC1100'><span class="cm">     * @return this.</span></div><div class='line' id='LC1101'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1102'><span class="cm">     *             If the key is null.</span></div><div class='line' id='LC1103'><span class="cm">     */</span></div><div class='line' id='LC1104'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">put</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="kt">long</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1105'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="k">new</span> <span class="n">Long</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC1106'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC1107'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1108'><br/></div><div class='line' id='LC1109'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1110'><span class="cm">     * Put a key/value pair in the JSONObject, where the value will be a</span></div><div class='line' id='LC1111'><span class="cm">     * JSONObject which is produced from a Map.</span></div><div class='line' id='LC1112'><span class="cm">     *</span></div><div class='line' id='LC1113'><span class="cm">     * @param key</span></div><div class='line' id='LC1114'><span class="cm">     *            A key string.</span></div><div class='line' id='LC1115'><span class="cm">     * @param value</span></div><div class='line' id='LC1116'><span class="cm">     *            A Map value.</span></div><div class='line' id='LC1117'><span class="cm">     * @return this.</span></div><div class='line' id='LC1118'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1119'><span class="cm">     */</span></div><div class='line' id='LC1120'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">put</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1121'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="k">new</span> <span class="n">JSONObject</span><span class="o">(</span><span class="n">value</span><span class="o">));</span></div><div class='line' id='LC1122'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC1123'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1124'><br/></div><div class='line' id='LC1125'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1126'><span class="cm">     * Put a key/value pair in the JSONObject. If the value is null, then the</span></div><div class='line' id='LC1127'><span class="cm">     * key will be removed from the JSONObject if it is present.</span></div><div class='line' id='LC1128'><span class="cm">     *</span></div><div class='line' id='LC1129'><span class="cm">     * @param key</span></div><div class='line' id='LC1130'><span class="cm">     *            A key string.</span></div><div class='line' id='LC1131'><span class="cm">     * @param value</span></div><div class='line' id='LC1132'><span class="cm">     *            An object which is the value. It should be of one of these</span></div><div class='line' id='LC1133'><span class="cm">     *            types: Boolean, Double, Integer, JSONArray, JSONObject, Long,</span></div><div class='line' id='LC1134'><span class="cm">     *            String, or the JSONObject.NULL object.</span></div><div class='line' id='LC1135'><span class="cm">     * @return this.</span></div><div class='line' id='LC1136'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1137'><span class="cm">     *             If the value is non-finite number or if the key is null.</span></div><div class='line' id='LC1138'><span class="cm">     */</span></div><div class='line' id='LC1139'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">put</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="n">Object</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1140'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">key</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1141'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">NullPointerException</span><span class="o">(</span><span class="s">&quot;Null key.&quot;</span><span class="o">);</span></div><div class='line' id='LC1142'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1143'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1144'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">testValidity</span><span class="o">(</span><span class="n">value</span><span class="o">);</span></div><div class='line' id='LC1145'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">map</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="n">value</span><span class="o">);</span></div><div class='line' id='LC1146'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC1147'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">remove</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC1148'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1149'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC1150'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1151'><br/></div><div class='line' id='LC1152'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1153'><span class="cm">     * Put a key/value pair in the JSONObject, but only if the key and the value</span></div><div class='line' id='LC1154'><span class="cm">     * are both non-null, and only if there is not already a member with that</span></div><div class='line' id='LC1155'><span class="cm">     * name.</span></div><div class='line' id='LC1156'><span class="cm">     *</span></div><div class='line' id='LC1157'><span class="cm">     * @param key string</span></div><div class='line' id='LC1158'><span class="cm">     * @param value object</span></div><div class='line' id='LC1159'><span class="cm">     * @return this.</span></div><div class='line' id='LC1160'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1161'><span class="cm">     *             if the key is a duplicate</span></div><div class='line' id='LC1162'><span class="cm">     */</span></div><div class='line' id='LC1163'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">putOnce</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="n">Object</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1164'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">key</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="n">value</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1165'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">key</span><span class="o">)</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1166'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;Duplicate key \&quot;&quot;</span> <span class="o">+</span> <span class="n">key</span> <span class="o">+</span> <span class="s">&quot;\&quot;&quot;</span><span class="o">);</span></div><div class='line' id='LC1167'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1168'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="n">value</span><span class="o">);</span></div><div class='line' id='LC1169'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1170'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC1171'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1172'><br/></div><div class='line' id='LC1173'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1174'><span class="cm">     * Put a key/value pair in the JSONObject, but only if the key and the value</span></div><div class='line' id='LC1175'><span class="cm">     * are both non-null.</span></div><div class='line' id='LC1176'><span class="cm">     *</span></div><div class='line' id='LC1177'><span class="cm">     * @param key</span></div><div class='line' id='LC1178'><span class="cm">     *            A key string.</span></div><div class='line' id='LC1179'><span class="cm">     * @param value</span></div><div class='line' id='LC1180'><span class="cm">     *            An object which is the value. It should be of one of these</span></div><div class='line' id='LC1181'><span class="cm">     *            types: Boolean, Double, Integer, JSONArray, JSONObject, Long,</span></div><div class='line' id='LC1182'><span class="cm">     *            String, or the JSONObject.NULL object.</span></div><div class='line' id='LC1183'><span class="cm">     * @return this.</span></div><div class='line' id='LC1184'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1185'><span class="cm">     *             If the value is a non-finite number.</span></div><div class='line' id='LC1186'><span class="cm">     */</span></div><div class='line' id='LC1187'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONObject</span> <span class="nf">putOpt</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">,</span> <span class="n">Object</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1188'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">key</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="n">value</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1189'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">key</span><span class="o">,</span> <span class="n">value</span><span class="o">);</span></div><div class='line' id='LC1190'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1191'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC1192'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1193'><br/></div><div class='line' id='LC1194'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1195'><span class="cm">     * Produce a string in double quotes with backslash sequences in all the</span></div><div class='line' id='LC1196'><span class="cm">     * right places. A backslash will be inserted within &lt;/, producing &lt;\/,</span></div><div class='line' id='LC1197'><span class="cm">     * allowing JSON text to be delivered in HTML. In JSON text, a string cannot</span></div><div class='line' id='LC1198'><span class="cm">     * contain a control character or an unescaped quote or backslash.</span></div><div class='line' id='LC1199'><span class="cm">     *</span></div><div class='line' id='LC1200'><span class="cm">     * @param string</span></div><div class='line' id='LC1201'><span class="cm">     *            A String</span></div><div class='line' id='LC1202'><span class="cm">     * @return A String correctly formatted for insertion in a JSON text.</span></div><div class='line' id='LC1203'><span class="cm">     */</span></div><div class='line' id='LC1204'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span> <span class="nf">quote</span><span class="o">(</span><span class="n">String</span> <span class="n">string</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1205'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">StringWriter</span> <span class="n">sw</span> <span class="o">=</span> <span class="k">new</span> <span class="n">StringWriter</span><span class="o">();</span></div><div class='line' id='LC1206'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">synchronized</span> <span class="o">(</span><span class="n">sw</span><span class="o">.</span><span class="na">getBuffer</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1207'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC1208'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">quote</span><span class="o">(</span><span class="n">string</span><span class="o">,</span> <span class="n">sw</span><span class="o">).</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC1209'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">IOException</span> <span class="n">ignored</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1210'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// will never happen - we are writing to a string writer</span></div><div class='line' id='LC1211'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC1212'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1213'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1214'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1215'><br/></div><div class='line' id='LC1216'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">Writer</span> <span class="nf">quote</span><span class="o">(</span><span class="n">String</span> <span class="n">string</span><span class="o">,</span> <span class="n">Writer</span> <span class="n">w</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC1217'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">string</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1218'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;\&quot;\&quot;&quot;</span><span class="o">);</span></div><div class='line' id='LC1219'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">w</span><span class="o">;</span></div><div class='line' id='LC1220'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1221'><br/></div><div class='line' id='LC1222'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">char</span> <span class="n">b</span><span class="o">;</span></div><div class='line' id='LC1223'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">char</span> <span class="n">c</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC1224'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">hhhh</span><span class="o">;</span></div><div class='line' id='LC1225'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">i</span><span class="o">;</span></div><div class='line' id='LC1226'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">len</span> <span class="o">=</span> <span class="n">string</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></div><div class='line' id='LC1227'><br/></div><div class='line' id='LC1228'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;&quot;&#39;</span><span class="o">);</span></div><div class='line' id='LC1229'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">len</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1230'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">b</span> <span class="o">=</span> <span class="n">c</span><span class="o">;</span></div><div class='line' id='LC1231'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">c</span> <span class="o">=</span> <span class="n">string</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></div><div class='line' id='LC1232'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">switch</span> <span class="o">(</span><span class="n">c</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1233'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;\\&#39;</span><span class="o">:</span></div><div class='line' id='LC1234'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;&quot;&#39;</span><span class="o">:</span></div><div class='line' id='LC1235'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;\\&#39;</span><span class="o">);</span></div><div class='line' id='LC1236'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">c</span><span class="o">);</span></div><div class='line' id='LC1237'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1238'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;/&#39;</span><span class="o">:</span></div><div class='line' id='LC1239'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">b</span> <span class="o">==</span> <span class="sc">&#39;&lt;&#39;</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1240'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;\\&#39;</span><span class="o">);</span></div><div class='line' id='LC1241'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1242'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">c</span><span class="o">);</span></div><div class='line' id='LC1243'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1244'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;\b&#39;</span><span class="o">:</span></div><div class='line' id='LC1245'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;\\b&quot;</span><span class="o">);</span></div><div class='line' id='LC1246'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1247'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;\t&#39;</span><span class="o">:</span></div><div class='line' id='LC1248'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;\\t&quot;</span><span class="o">);</span></div><div class='line' id='LC1249'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1250'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;\n&#39;</span><span class="o">:</span></div><div class='line' id='LC1251'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;\\n&quot;</span><span class="o">);</span></div><div class='line' id='LC1252'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1253'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;\f&#39;</span><span class="o">:</span></div><div class='line' id='LC1254'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;\\f&quot;</span><span class="o">);</span></div><div class='line' id='LC1255'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1256'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="sc">&#39;\r&#39;</span><span class="o">:</span></div><div class='line' id='LC1257'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;\\r&quot;</span><span class="o">);</span></div><div class='line' id='LC1258'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1259'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">default</span><span class="o">:</span></div><div class='line' id='LC1260'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">c</span> <span class="o">&lt;</span> <span class="sc">&#39; &#39;</span> <span class="o">||</span> <span class="o">(</span><span class="n">c</span> <span class="o">&gt;=</span> <span class="sc">&#39;\u0080&#39;</span> <span class="o">&amp;&amp;</span> <span class="n">c</span> <span class="o">&lt;</span> <span class="sc">&#39;\u00a0&#39;</span><span class="o">)</span></div><div class='line' id='LC1261'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="o">(</span><span class="n">c</span> <span class="o">&gt;=</span> <span class="sc">&#39;\u2000&#39;</span> <span class="o">&amp;&amp;</span> <span class="n">c</span> <span class="o">&lt;</span> <span class="sc">&#39;\u2100&#39;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1262'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;\\u&quot;</span><span class="o">);</span></div><div class='line' id='LC1263'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">hhhh</span> <span class="o">=</span> <span class="n">Integer</span><span class="o">.</span><span class="na">toHexString</span><span class="o">(</span><span class="n">c</span><span class="o">);</span></div><div class='line' id='LC1264'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;0000&quot;</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="mi">4</span> <span class="o">-</span> <span class="n">hhhh</span><span class="o">.</span><span class="na">length</span><span class="o">());</span></div><div class='line' id='LC1265'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">hhhh</span><span class="o">);</span></div><div class='line' id='LC1266'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC1267'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">c</span><span class="o">);</span></div><div class='line' id='LC1268'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1269'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1270'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1271'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">w</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;&quot;&#39;</span><span class="o">);</span></div><div class='line' id='LC1272'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">w</span><span class="o">;</span></div><div class='line' id='LC1273'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1274'><br/></div><div class='line' id='LC1275'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1276'><span class="cm">     * Remove a name and its value, if present.</span></div><div class='line' id='LC1277'><span class="cm">     *</span></div><div class='line' id='LC1278'><span class="cm">     * @param key</span></div><div class='line' id='LC1279'><span class="cm">     *            The name to be removed.</span></div><div class='line' id='LC1280'><span class="cm">     * @return The value that was associated with the name, or null if there was</span></div><div class='line' id='LC1281'><span class="cm">     *         no value.</span></div><div class='line' id='LC1282'><span class="cm">     */</span></div><div class='line' id='LC1283'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Object</span> <span class="nf">remove</span><span class="o">(</span><span class="n">String</span> <span class="n">key</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1284'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">map</span><span class="o">.</span><span class="na">remove</span><span class="o">(</span><span class="n">key</span><span class="o">);</span></div><div class='line' id='LC1285'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1286'><br/></div><div class='line' id='LC1287'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1288'><span class="cm">     * Determine if two JSONObjects are similar.</span></div><div class='line' id='LC1289'><span class="cm">     * They must contain the same set of names which must be associated with</span></div><div class='line' id='LC1290'><span class="cm">     * similar values.</span></div><div class='line' id='LC1291'><span class="cm">     *</span></div><div class='line' id='LC1292'><span class="cm">     * @param other The other JSONObject</span></div><div class='line' id='LC1293'><span class="cm">     * @return true if they are equal</span></div><div class='line' id='LC1294'><span class="cm">     */</span></div><div class='line' id='LC1295'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">similar</span><span class="o">(</span><span class="n">Object</span> <span class="n">other</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1296'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC1297'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!(</span><span class="n">other</span> <span class="k">instanceof</span> <span class="n">JSONObject</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1298'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1299'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1300'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Set</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">set</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">keySet</span><span class="o">();</span></div><div class='line' id='LC1301'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">set</span><span class="o">.</span><span class="na">equals</span><span class="o">(((</span><span class="n">JSONObject</span><span class="o">)</span><span class="n">other</span><span class="o">).</span><span class="na">keySet</span><span class="o">()))</span> <span class="o">{</span></div><div class='line' id='LC1302'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1303'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1304'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Iterator</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">iterator</span> <span class="o">=</span> <span class="n">set</span><span class="o">.</span><span class="na">iterator</span><span class="o">();</span></div><div class='line' id='LC1305'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">(</span><span class="n">iterator</span><span class="o">.</span><span class="na">hasNext</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1306'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">name</span> <span class="o">=</span> <span class="n">iterator</span><span class="o">.</span><span class="na">next</span><span class="o">();</span></div><div class='line' id='LC1307'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">valueThis</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">name</span><span class="o">);</span></div><div class='line' id='LC1308'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">valueOther</span> <span class="o">=</span> <span class="o">((</span><span class="n">JSONObject</span><span class="o">)</span><span class="n">other</span><span class="o">).</span><span class="na">get</span><span class="o">(</span><span class="n">name</span><span class="o">);</span></div><div class='line' id='LC1309'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">valueThis</span> <span class="k">instanceof</span> <span class="n">JSONObject</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1310'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!((</span><span class="n">JSONObject</span><span class="o">)</span><span class="n">valueThis</span><span class="o">).</span><span class="na">similar</span><span class="o">(</span><span class="n">valueOther</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1311'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1312'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1313'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">valueThis</span> <span class="k">instanceof</span> <span class="n">JSONArray</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1314'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!((</span><span class="n">JSONArray</span><span class="o">)</span><span class="n">valueThis</span><span class="o">).</span><span class="na">similar</span><span class="o">(</span><span class="n">valueOther</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1315'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1316'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1317'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(!</span><span class="n">valueThis</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">valueOther</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1318'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1319'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1320'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1321'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC1322'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Throwable</span> <span class="n">exception</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1323'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1324'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1325'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1326'><br/></div><div class='line' id='LC1327'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1328'><span class="cm">     * Try to convert a string into a number, boolean, or null. If the string</span></div><div class='line' id='LC1329'><span class="cm">     * can&#39;t be converted, return the string.</span></div><div class='line' id='LC1330'><span class="cm">     *</span></div><div class='line' id='LC1331'><span class="cm">     * @param string</span></div><div class='line' id='LC1332'><span class="cm">     *            A String.</span></div><div class='line' id='LC1333'><span class="cm">     * @return A simple JSON value.</span></div><div class='line' id='LC1334'><span class="cm">     */</span></div><div class='line' id='LC1335'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">Object</span> <span class="nf">stringToValue</span><span class="o">(</span><span class="n">String</span> <span class="n">string</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1336'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Double</span> <span class="n">d</span><span class="o">;</span></div><div class='line' id='LC1337'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1338'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">string</span><span class="o">;</span></div><div class='line' id='LC1339'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1340'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">equalsIgnoreCase</span><span class="o">(</span><span class="s">&quot;true&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1341'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">Boolean</span><span class="o">.</span><span class="na">TRUE</span><span class="o">;</span></div><div class='line' id='LC1342'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1343'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">equalsIgnoreCase</span><span class="o">(</span><span class="s">&quot;false&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1344'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">Boolean</span><span class="o">.</span><span class="na">FALSE</span><span class="o">;</span></div><div class='line' id='LC1345'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1346'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">equalsIgnoreCase</span><span class="o">(</span><span class="s">&quot;null&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1347'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">JSONObject</span><span class="o">.</span><span class="na">NULL</span><span class="o">;</span></div><div class='line' id='LC1348'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1349'><br/></div><div class='line' id='LC1350'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/*</span></div><div class='line' id='LC1351'><span class="cm">         * If it might be a number, try converting it. If a number cannot be</span></div><div class='line' id='LC1352'><span class="cm">         * produced, then the value will just be a string.</span></div><div class='line' id='LC1353'><span class="cm">         */</span></div><div class='line' id='LC1354'><br/></div><div class='line' id='LC1355'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">char</span> <span class="n">b</span> <span class="o">=</span> <span class="n">string</span><span class="o">.</span><span class="na">charAt</span><span class="o">(</span><span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC1356'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">((</span><span class="n">b</span> <span class="o">&gt;=</span> <span class="sc">&#39;0&#39;</span> <span class="o">&amp;&amp;</span> <span class="n">b</span> <span class="o">&lt;=</span> <span class="sc">&#39;9&#39;</span><span class="o">)</span> <span class="o">||</span> <span class="n">b</span> <span class="o">==</span> <span class="sc">&#39;-&#39;</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1357'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC1358'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">&#39;.&#39;</span><span class="o">)</span> <span class="o">&gt;</span> <span class="o">-</span><span class="mi">1</span> <span class="o">||</span> <span class="n">string</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">&#39;e&#39;</span><span class="o">)</span> <span class="o">&gt;</span> <span class="o">-</span><span class="mi">1</span></div><div class='line' id='LC1359'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">string</span><span class="o">.</span><span class="na">indexOf</span><span class="o">(</span><span class="sc">&#39;E&#39;</span><span class="o">)</span> <span class="o">&gt;</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1360'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">d</span> <span class="o">=</span> <span class="n">Double</span><span class="o">.</span><span class="na">valueOf</span><span class="o">(</span><span class="n">string</span><span class="o">);</span></div><div class='line' id='LC1361'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">d</span><span class="o">.</span><span class="na">isInfinite</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">d</span><span class="o">.</span><span class="na">isNaN</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1362'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">d</span><span class="o">;</span></div><div class='line' id='LC1363'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1364'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC1365'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Long</span> <span class="n">myLong</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Long</span><span class="o">(</span><span class="n">string</span><span class="o">);</span></div><div class='line' id='LC1366'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">string</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">myLong</span><span class="o">.</span><span class="na">toString</span><span class="o">()))</span> <span class="o">{</span></div><div class='line' id='LC1367'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">myLong</span> <span class="o">==</span> <span class="n">myLong</span><span class="o">.</span><span class="na">intValue</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1368'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">myLong</span><span class="o">.</span><span class="na">intValue</span><span class="o">();</span></div><div class='line' id='LC1369'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC1370'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">myLong</span><span class="o">;</span></div><div class='line' id='LC1371'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1372'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1373'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1374'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">ignore</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1375'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1376'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1377'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">string</span><span class="o">;</span></div><div class='line' id='LC1378'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1379'><br/></div><div class='line' id='LC1380'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1381'><span class="cm">     * Throw an exception if the object is a NaN or infinite number.</span></div><div class='line' id='LC1382'><span class="cm">     *</span></div><div class='line' id='LC1383'><span class="cm">     * @param o</span></div><div class='line' id='LC1384'><span class="cm">     *            The object to test.</span></div><div class='line' id='LC1385'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1386'><span class="cm">     *             If o is a non-finite number.</span></div><div class='line' id='LC1387'><span class="cm">     */</span></div><div class='line' id='LC1388'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">testValidity</span><span class="o">(</span><span class="n">Object</span> <span class="n">o</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1389'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">o</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1390'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">o</span> <span class="k">instanceof</span> <span class="n">Double</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1391'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(((</span><span class="n">Double</span><span class="o">)</span> <span class="n">o</span><span class="o">).</span><span class="na">isInfinite</span><span class="o">()</span> <span class="o">||</span> <span class="o">((</span><span class="n">Double</span><span class="o">)</span> <span class="n">o</span><span class="o">).</span><span class="na">isNaN</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1392'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span></div><div class='line' id='LC1393'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;JSON does not allow non-finite numbers.&quot;</span><span class="o">);</span></div><div class='line' id='LC1394'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1395'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">o</span> <span class="k">instanceof</span> <span class="n">Float</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1396'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(((</span><span class="n">Float</span><span class="o">)</span> <span class="n">o</span><span class="o">).</span><span class="na">isInfinite</span><span class="o">()</span> <span class="o">||</span> <span class="o">((</span><span class="n">Float</span><span class="o">)</span> <span class="n">o</span><span class="o">).</span><span class="na">isNaN</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1397'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span></div><div class='line' id='LC1398'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;JSON does not allow non-finite numbers.&quot;</span><span class="o">);</span></div><div class='line' id='LC1399'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1400'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1401'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1402'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1403'><br/></div><div class='line' id='LC1404'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1405'><span class="cm">     * Produce a JSONArray containing the values of the members of this</span></div><div class='line' id='LC1406'><span class="cm">     * JSONObject.</span></div><div class='line' id='LC1407'><span class="cm">     *</span></div><div class='line' id='LC1408'><span class="cm">     * @param names</span></div><div class='line' id='LC1409'><span class="cm">     *            A JSONArray containing a list of key strings. This determines</span></div><div class='line' id='LC1410'><span class="cm">     *            the sequence of the values in the result.</span></div><div class='line' id='LC1411'><span class="cm">     * @return A JSONArray of values.</span></div><div class='line' id='LC1412'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1413'><span class="cm">     *             If any of the values are non-finite numbers.</span></div><div class='line' id='LC1414'><span class="cm">     */</span></div><div class='line' id='LC1415'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">JSONArray</span> <span class="nf">toJSONArray</span><span class="o">(</span><span class="n">JSONArray</span> <span class="n">names</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1416'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">names</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">names</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1417'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC1418'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1419'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">JSONArray</span> <span class="n">ja</span> <span class="o">=</span> <span class="k">new</span> <span class="n">JSONArray</span><span class="o">();</span></div><div class='line' id='LC1420'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">names</span><span class="o">.</span><span class="na">length</span><span class="o">();</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1421'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ja</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">opt</span><span class="o">(</span><span class="n">names</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="n">i</span><span class="o">)));</span></div><div class='line' id='LC1422'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1423'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">ja</span><span class="o">;</span></div><div class='line' id='LC1424'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1425'><br/></div><div class='line' id='LC1426'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1427'><span class="cm">     * Make a JSON text of this JSONObject. For compactness, no whitespace is</span></div><div class='line' id='LC1428'><span class="cm">     * added. If this would not result in a syntactically correct JSON text,</span></div><div class='line' id='LC1429'><span class="cm">     * then null will be returned instead.</span></div><div class='line' id='LC1430'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC1431'><span class="cm">     * Warning: This method assumes that the data structure is acyclical.</span></div><div class='line' id='LC1432'><span class="cm">     *</span></div><div class='line' id='LC1433'><span class="cm">     * @return a printable, displayable, portable, transmittable representation</span></div><div class='line' id='LC1434'><span class="cm">     *         of the object, beginning with &lt;code&gt;{&lt;/code&gt;&amp;nbsp;&lt;small&gt;(left</span></div><div class='line' id='LC1435'><span class="cm">     *         brace)&lt;/small&gt; and ending with &lt;code&gt;}&lt;/code&gt;&amp;nbsp;&lt;small&gt;(right</span></div><div class='line' id='LC1436'><span class="cm">     *         brace)&lt;/small&gt;.</span></div><div class='line' id='LC1437'><span class="cm">     */</span></div><div class='line' id='LC1438'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">toString</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC1439'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC1440'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">toString</span><span class="o">(</span><span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC1441'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1442'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC1443'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1444'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1445'><br/></div><div class='line' id='LC1446'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1447'><span class="cm">     * Make a prettyprinted JSON text of this JSONObject.</span></div><div class='line' id='LC1448'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC1449'><span class="cm">     * Warning: This method assumes that the data structure is acyclical.</span></div><div class='line' id='LC1450'><span class="cm">     *</span></div><div class='line' id='LC1451'><span class="cm">     * @param indentFactor</span></div><div class='line' id='LC1452'><span class="cm">     *            The number of spaces to add to each level of indentation.</span></div><div class='line' id='LC1453'><span class="cm">     * @return a printable, displayable, portable, transmittable representation</span></div><div class='line' id='LC1454'><span class="cm">     *         of the object, beginning with &lt;code&gt;{&lt;/code&gt;&amp;nbsp;&lt;small&gt;(left</span></div><div class='line' id='LC1455'><span class="cm">     *         brace)&lt;/small&gt; and ending with &lt;code&gt;}&lt;/code&gt;&amp;nbsp;&lt;small&gt;(right</span></div><div class='line' id='LC1456'><span class="cm">     *         brace)&lt;/small&gt;.</span></div><div class='line' id='LC1457'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1458'><span class="cm">     *             If the object contains an invalid number.</span></div><div class='line' id='LC1459'><span class="cm">     */</span></div><div class='line' id='LC1460'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">toString</span><span class="o">(</span><span class="kt">int</span> <span class="n">indentFactor</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1461'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">StringWriter</span> <span class="n">w</span> <span class="o">=</span> <span class="k">new</span> <span class="n">StringWriter</span><span class="o">();</span></div><div class='line' id='LC1462'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">synchronized</span> <span class="o">(</span><span class="n">w</span><span class="o">.</span><span class="na">getBuffer</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1463'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">w</span><span class="o">,</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="mi">0</span><span class="o">).</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC1464'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1465'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1466'><br/></div><div class='line' id='LC1467'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1468'><span class="cm">     * Make a JSON text of an Object value. If the object has an</span></div><div class='line' id='LC1469'><span class="cm">     * value.toJSONString() method, then that method will be used to produce the</span></div><div class='line' id='LC1470'><span class="cm">     * JSON text. The method is required to produce a strictly conforming text.</span></div><div class='line' id='LC1471'><span class="cm">     * If the object does not contain a toJSONString method (which is the most</span></div><div class='line' id='LC1472'><span class="cm">     * common case), then a text will be produced by other means. If the value</span></div><div class='line' id='LC1473'><span class="cm">     * is an array or Collection, then a JSONArray will be made from it and its</span></div><div class='line' id='LC1474'><span class="cm">     * toJSONString method will be called. If the value is a MAP, then a</span></div><div class='line' id='LC1475'><span class="cm">     * JSONObject will be made from it and its toJSONString method will be</span></div><div class='line' id='LC1476'><span class="cm">     * called. Otherwise, the value&#39;s toString method will be called, and the</span></div><div class='line' id='LC1477'><span class="cm">     * result will be quoted.</span></div><div class='line' id='LC1478'><span class="cm">     *</span></div><div class='line' id='LC1479'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC1480'><span class="cm">     * Warning: This method assumes that the data structure is acyclical.</span></div><div class='line' id='LC1481'><span class="cm">     *</span></div><div class='line' id='LC1482'><span class="cm">     * @param value</span></div><div class='line' id='LC1483'><span class="cm">     *            The value to be serialized.</span></div><div class='line' id='LC1484'><span class="cm">     * @return a printable, displayable, transmittable representation of the</span></div><div class='line' id='LC1485'><span class="cm">     *         object, beginning with &lt;code&gt;{&lt;/code&gt;&amp;nbsp;&lt;small&gt;(left</span></div><div class='line' id='LC1486'><span class="cm">     *         brace)&lt;/small&gt; and ending with &lt;code&gt;}&lt;/code&gt;&amp;nbsp;&lt;small&gt;(right</span></div><div class='line' id='LC1487'><span class="cm">     *         brace)&lt;/small&gt;.</span></div><div class='line' id='LC1488'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1489'><span class="cm">     *             If the value is or contains an invalid number.</span></div><div class='line' id='LC1490'><span class="cm">     */</span></div><div class='line' id='LC1491'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span> <span class="nf">valueToString</span><span class="o">(</span><span class="n">Object</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1492'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">value</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="kc">null</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1493'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="s">&quot;null&quot;</span><span class="o">;</span></div><div class='line' id='LC1494'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1495'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">JSONString</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1496'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC1497'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC1498'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">object</span> <span class="o">=</span> <span class="o">((</span><span class="n">JSONString</span><span class="o">)</span> <span class="n">value</span><span class="o">).</span><span class="na">toJSONString</span><span class="o">();</span></div><div class='line' id='LC1499'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1500'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="n">e</span><span class="o">);</span></div><div class='line' id='LC1501'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1502'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">String</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1503'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">(</span><span class="n">String</span><span class="o">)</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC1504'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1505'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="s">&quot;Bad value from toJSONString: &quot;</span> <span class="o">+</span> <span class="n">object</span><span class="o">);</span></div><div class='line' id='LC1506'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1507'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Number</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1508'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">numberToString</span><span class="o">((</span><span class="n">Number</span><span class="o">)</span> <span class="n">value</span><span class="o">);</span></div><div class='line' id='LC1509'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1510'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Boolean</span> <span class="o">||</span> <span class="n">value</span> <span class="k">instanceof</span> <span class="n">JSONObject</span></div><div class='line' id='LC1511'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">value</span> <span class="k">instanceof</span> <span class="n">JSONArray</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1512'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">value</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC1513'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1514'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Map</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1515'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">new</span> <span class="nf">JSONObject</span><span class="o">((</span><span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;)</span><span class="n">value</span><span class="o">).</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC1516'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1517'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Collection</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1518'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">new</span> <span class="nf">JSONArray</span><span class="o">((</span><span class="n">Collection</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;)</span> <span class="n">value</span><span class="o">).</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC1519'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1520'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span><span class="o">.</span><span class="na">getClass</span><span class="o">().</span><span class="na">isArray</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1521'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">new</span> <span class="nf">JSONArray</span><span class="o">(</span><span class="n">value</span><span class="o">).</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC1522'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1523'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">quote</span><span class="o">(</span><span class="n">value</span><span class="o">.</span><span class="na">toString</span><span class="o">());</span></div><div class='line' id='LC1524'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1525'><br/></div><div class='line' id='LC1526'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1527'><span class="cm">     * Wrap an object, if necessary. If the object is null, return the NULL</span></div><div class='line' id='LC1528'><span class="cm">     * object. If it is an array or collection, wrap it in a JSONArray. If it is</span></div><div class='line' id='LC1529'><span class="cm">     * a map, wrap it in a JSONObject. If it is a standard property (Double,</span></div><div class='line' id='LC1530'><span class="cm">     * String, et al) then it is already wrapped. Otherwise, if it comes from</span></div><div class='line' id='LC1531'><span class="cm">     * one of the java packages, turn it into a string. And if it doesn&#39;t, try</span></div><div class='line' id='LC1532'><span class="cm">     * to wrap it in a JSONObject. If the wrapping fails, then null is returned.</span></div><div class='line' id='LC1533'><span class="cm">     *</span></div><div class='line' id='LC1534'><span class="cm">     * @param object</span></div><div class='line' id='LC1535'><span class="cm">     *            The object to wrap</span></div><div class='line' id='LC1536'><span class="cm">     * @return The wrapped value</span></div><div class='line' id='LC1537'><span class="cm">     */</span></div><div class='line' id='LC1538'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">static</span> <span class="n">Object</span> <span class="nf">wrap</span><span class="o">(</span><span class="n">Object</span> <span class="n">object</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1539'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC1540'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1541'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">NULL</span><span class="o">;</span></div><div class='line' id='LC1542'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1543'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">JSONObject</span> <span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">JSONArray</span></div><div class='line' id='LC1544'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">NULL</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">object</span><span class="o">)</span> <span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">JSONString</span></div><div class='line' id='LC1545'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Byte</span> <span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Character</span></div><div class='line' id='LC1546'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Short</span> <span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Integer</span></div><div class='line' id='LC1547'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Long</span> <span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Boolean</span></div><div class='line' id='LC1548'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Float</span> <span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">Double</span></div><div class='line' id='LC1549'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">object</span> <span class="k">instanceof</span> <span class="n">String</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1550'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span><span class="o">;</span></div><div class='line' id='LC1551'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1552'><br/></div><div class='line' id='LC1553'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">Collection</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1554'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">new</span> <span class="nf">JSONArray</span><span class="o">((</span><span class="n">Collection</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;)</span> <span class="n">object</span><span class="o">);</span></div><div class='line' id='LC1555'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1556'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span><span class="o">.</span><span class="na">getClass</span><span class="o">().</span><span class="na">isArray</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1557'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">new</span> <span class="nf">JSONArray</span><span class="o">(</span><span class="n">object</span><span class="o">);</span></div><div class='line' id='LC1558'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1559'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">object</span> <span class="k">instanceof</span> <span class="n">Map</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1560'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">new</span> <span class="nf">JSONObject</span><span class="o">((</span><span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;)</span> <span class="n">object</span><span class="o">);</span></div><div class='line' id='LC1561'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1562'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Package</span> <span class="n">objectPackage</span> <span class="o">=</span> <span class="n">object</span><span class="o">.</span><span class="na">getClass</span><span class="o">().</span><span class="na">getPackage</span><span class="o">();</span></div><div class='line' id='LC1563'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">objectPackageName</span> <span class="o">=</span> <span class="n">objectPackage</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">?</span> <span class="n">objectPackage</span></div><div class='line' id='LC1564'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">getName</span><span class="o">()</span> <span class="o">:</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC1565'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">objectPackageName</span><span class="o">.</span><span class="na">startsWith</span><span class="o">(</span><span class="s">&quot;java.&quot;</span><span class="o">)</span></div><div class='line' id='LC1566'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">objectPackageName</span><span class="o">.</span><span class="na">startsWith</span><span class="o">(</span><span class="s">&quot;javax.&quot;</span><span class="o">)</span></div><div class='line' id='LC1567'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">||</span> <span class="n">object</span><span class="o">.</span><span class="na">getClass</span><span class="o">().</span><span class="na">getClassLoader</span><span class="o">()</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1568'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">object</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC1569'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1570'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">new</span> <span class="nf">JSONObject</span><span class="o">(</span><span class="n">object</span><span class="o">);</span></div><div class='line' id='LC1571'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">exception</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1572'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC1573'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1574'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1575'><br/></div><div class='line' id='LC1576'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1577'><span class="cm">     * Write the contents of the JSONObject as JSON text to a writer. For</span></div><div class='line' id='LC1578'><span class="cm">     * compactness, no whitespace is added.</span></div><div class='line' id='LC1579'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC1580'><span class="cm">     * Warning: This method assumes that the data structure is acyclical.</span></div><div class='line' id='LC1581'><span class="cm">     *</span></div><div class='line' id='LC1582'><span class="cm">     * @return The writer.</span></div><div class='line' id='LC1583'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1584'><span class="cm">     */</span></div><div class='line' id='LC1585'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Writer</span> <span class="nf">write</span><span class="o">(</span><span class="n">Writer</span> <span class="n">writer</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1586'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC1587'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1588'><br/></div><div class='line' id='LC1589'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">static</span> <span class="kd">final</span> <span class="n">Writer</span> <span class="nf">writeValue</span><span class="o">(</span><span class="n">Writer</span> <span class="n">writer</span><span class="o">,</span> <span class="n">Object</span> <span class="n">value</span><span class="o">,</span></div><div class='line' id='LC1590'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="kt">int</span> <span class="n">indent</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">JSONException</span><span class="o">,</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC1591'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">value</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="kc">null</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1592'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;null&quot;</span><span class="o">);</span></div><div class='line' id='LC1593'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">JSONObject</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1594'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">((</span><span class="n">JSONObject</span><span class="o">)</span> <span class="n">value</span><span class="o">).</span><span class="na">write</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="n">indent</span><span class="o">);</span></div><div class='line' id='LC1595'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">JSONArray</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1596'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">((</span><span class="n">JSONArray</span><span class="o">)</span> <span class="n">value</span><span class="o">).</span><span class="na">write</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="n">indent</span><span class="o">);</span></div><div class='line' id='LC1597'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Map</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1598'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">new</span> <span class="nf">JSONObject</span><span class="o">((</span><span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;)</span> <span class="n">value</span><span class="o">).</span><span class="na">write</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="n">indent</span><span class="o">);</span></div><div class='line' id='LC1599'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Collection</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1600'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">new</span> <span class="nf">JSONArray</span><span class="o">((</span><span class="n">Collection</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">&gt;)</span> <span class="n">value</span><span class="o">).</span><span class="na">write</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="n">indentFactor</span><span class="o">,</span></div><div class='line' id='LC1601'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">indent</span><span class="o">);</span></div><div class='line' id='LC1602'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span><span class="o">.</span><span class="na">getClass</span><span class="o">().</span><span class="na">isArray</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1603'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">new</span> <span class="nf">JSONArray</span><span class="o">(</span><span class="n">value</span><span class="o">).</span><span class="na">write</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="n">indent</span><span class="o">);</span></div><div class='line' id='LC1604'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Number</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1605'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">numberToString</span><span class="o">((</span><span class="n">Number</span><span class="o">)</span> <span class="n">value</span><span class="o">));</span></div><div class='line' id='LC1606'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">Boolean</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1607'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">value</span><span class="o">.</span><span class="na">toString</span><span class="o">());</span></div><div class='line' id='LC1608'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="k">instanceof</span> <span class="n">JSONString</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1609'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">o</span><span class="o">;</span></div><div class='line' id='LC1610'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC1611'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">o</span> <span class="o">=</span> <span class="o">((</span><span class="n">JSONString</span><span class="o">)</span> <span class="n">value</span><span class="o">).</span><span class="na">toJSONString</span><span class="o">();</span></div><div class='line' id='LC1612'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1613'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="n">e</span><span class="o">);</span></div><div class='line' id='LC1614'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1615'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">o</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">?</span> <span class="n">o</span><span class="o">.</span><span class="na">toString</span><span class="o">()</span> <span class="o">:</span> <span class="n">quote</span><span class="o">(</span><span class="n">value</span><span class="o">.</span><span class="na">toString</span><span class="o">()));</span></div><div class='line' id='LC1616'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC1617'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">quote</span><span class="o">(</span><span class="n">value</span><span class="o">.</span><span class="na">toString</span><span class="o">(),</span> <span class="n">writer</span><span class="o">);</span></div><div class='line' id='LC1618'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1619'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">writer</span><span class="o">;</span></div><div class='line' id='LC1620'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1621'><br/></div><div class='line' id='LC1622'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">static</span> <span class="kd">final</span> <span class="kt">void</span> <span class="nf">indent</span><span class="o">(</span><span class="n">Writer</span> <span class="n">writer</span><span class="o">,</span> <span class="kt">int</span> <span class="n">indent</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC1623'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">indent</span><span class="o">;</span> <span class="n">i</span> <span class="o">+=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1624'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39; &#39;</span><span class="o">);</span></div><div class='line' id='LC1625'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1626'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1627'><br/></div><div class='line' id='LC1628'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1629'><span class="cm">     * Write the contents of the JSONObject as JSON text to a writer. For</span></div><div class='line' id='LC1630'><span class="cm">     * compactness, no whitespace is added.</span></div><div class='line' id='LC1631'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC1632'><span class="cm">     * Warning: This method assumes that the data structure is acyclical.</span></div><div class='line' id='LC1633'><span class="cm">     *</span></div><div class='line' id='LC1634'><span class="cm">     * @return The writer.</span></div><div class='line' id='LC1635'><span class="cm">     * @throws JSONException</span></div><div class='line' id='LC1636'><span class="cm">     */</span></div><div class='line' id='LC1637'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Writer</span> <span class="nf">write</span><span class="o">(</span><span class="n">Writer</span> <span class="n">writer</span><span class="o">,</span> <span class="kt">int</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="kt">int</span> <span class="n">indent</span><span class="o">)</span></div><div class='line' id='LC1638'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">throws</span> <span class="n">JSONException</span> <span class="o">{</span></div><div class='line' id='LC1639'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC1640'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">commanate</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1641'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="kt">int</span> <span class="n">length</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">length</span><span class="o">();</span></div><div class='line' id='LC1642'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Iterator</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">keys</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">keys</span><span class="o">();</span></div><div class='line' id='LC1643'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;{&#39;</span><span class="o">);</span></div><div class='line' id='LC1644'><br/></div><div class='line' id='LC1645'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">length</span> <span class="o">==</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1646'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">key</span> <span class="o">=</span> <span class="n">keys</span><span class="o">.</span><span class="na">next</span><span class="o">();</span></div><div class='line' id='LC1647'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">.</span><span class="na">toString</span><span class="o">()));</span></div><div class='line' id='LC1648'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;:&#39;</span><span class="o">);</span></div><div class='line' id='LC1649'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">indentFactor</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1650'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39; &#39;</span><span class="o">);</span></div><div class='line' id='LC1651'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1652'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writeValue</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="k">this</span><span class="o">.</span><span class="na">map</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">),</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="n">indent</span><span class="o">);</span></div><div class='line' id='LC1653'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">length</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1654'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="kt">int</span> <span class="n">newindent</span> <span class="o">=</span> <span class="n">indent</span> <span class="o">+</span> <span class="n">indentFactor</span><span class="o">;</span></div><div class='line' id='LC1655'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">(</span><span class="n">keys</span><span class="o">.</span><span class="na">hasNext</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1656'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Object</span> <span class="n">key</span> <span class="o">=</span> <span class="n">keys</span><span class="o">.</span><span class="na">next</span><span class="o">();</span></div><div class='line' id='LC1657'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">commanate</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1658'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;,&#39;</span><span class="o">);</span></div><div class='line' id='LC1659'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1660'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">indentFactor</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1661'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;\n&#39;</span><span class="o">);</span></div><div class='line' id='LC1662'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1663'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">indent</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="n">newindent</span><span class="o">);</span></div><div class='line' id='LC1664'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">quote</span><span class="o">(</span><span class="n">key</span><span class="o">.</span><span class="na">toString</span><span class="o">()));</span></div><div class='line' id='LC1665'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;:&#39;</span><span class="o">);</span></div><div class='line' id='LC1666'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">indentFactor</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1667'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39; &#39;</span><span class="o">);</span></div><div class='line' id='LC1668'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1669'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writeValue</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="k">this</span><span class="o">.</span><span class="na">map</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">key</span><span class="o">),</span> <span class="n">indentFactor</span><span class="o">,</span> <span class="n">newindent</span><span class="o">);</span></div><div class='line' id='LC1670'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">commanate</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC1671'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1672'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">indentFactor</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1673'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;\n&#39;</span><span class="o">);</span></div><div class='line' id='LC1674'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1675'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">indent</span><span class="o">(</span><span class="n">writer</span><span class="o">,</span> <span class="n">indent</span><span class="o">);</span></div><div class='line' id='LC1676'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1677'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">writer</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="sc">&#39;}&#39;</span><span class="o">);</span></div><div class='line' id='LC1678'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">writer</span><span class="o">;</span></div><div class='line' id='LC1679'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">IOException</span> <span class="n">exception</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1680'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">JSONException</span><span class="o">(</span><span class="n">exception</span><span class="o">);</span></div><div class='line' id='LC1681'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1682'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1683'><span class="o">}</span></div></pre></div></td>
         </tr>
       </table>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.07167s from github-fe123-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-x close js-ajax-error-dismiss" aria-label="Dismiss error"></a>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-51e3b077e56f2f3244290e430b8d05253607065b.js" type="text/javascript"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github-f92d49cb0619e2060af322349fe2acfbc9e011fc.js" type="text/javascript"></script>
      
      
        <script async src="https://www.google-analytics.com/analytics.js"></script>
  </body>
</html>

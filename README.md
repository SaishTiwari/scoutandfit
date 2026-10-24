# Scout & Fit

**Discover talent. Find the fit.**

Scout & Fit is a football scouting and tactical intelligence platform designed to identify players based on their playing styles, statistical profiles, and compatibility with different tactical systems.

## The Problem

Traditional football statistics often focus on goals, assists, and other headline numbers. However, two players with similar statistics may perform very different tactical roles.

Scout & Fit aims to go beyond surface-level statistics by examining how players contribute to the game and how their attributes align with specific tactical requirements.

## Core Features

- **Player DNA:** Analyze player-season profiles and discover players with similar playing styles.
- **Player Comparison:** Compare footballers using normalized performance metrics and visualizations.
- **Tactical Builder:** Create custom formations, playing philosophies, and positional requirements.
- **Tactical Fit:** Evaluate how well a player matches a particular role and system.
- **Historical Teams:** Explore famous tactical systems and search for potential player replacements.
- **Explainable Scouting:** Understand the metrics and assumptions behind recommendations.

## Technology Stack

- **Backend:** Java 21, Spring Boot
- **Frontend:** React, TypeScript, Tailwind CSS
- **Database:** PostgreSQL
- **Data Analytics:** Python, Pandas, NumPy, scikit-learn
- **Infrastructure:** Docker, GitHub Actions, AWS

## Project Structure

```text
backend/      Java REST API
frontend/     Web application
analytics/    Football data processing and analysis
database/     Database scripts and migrations
docs/         Architecture and technical documentation
```

## Development Status

Currently in initial development.

The first milestone is to establish the application foundation and build a reliable football data ingestion pipeline using publicly available event datasets.

## Project Vision

Build an accessible, evidence-based football intelligence platform that helps answer a fundamental recruitment question:

**Not just who is the best player, but who is the right player for the system?**

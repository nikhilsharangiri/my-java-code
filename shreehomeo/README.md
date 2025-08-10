# Shreehomeo Website

A clean, professional, and responsive website for the Shreehomeo Homeopathy Clinic.

## Quick start
- Open `index.html` in your browser, or run a local static server:
  
  ```bash
  cd /workspace/shreehomeo
  python3 -m http.server 8080
  # then visit http://localhost:8080
  ```

## Structure
- `index.html`: Homepage with sections – Hero, About, Services, Testimonials, Contact, Blog
- `booking.html`: Dedicated booking form
- `assets/css/style.css`: Styles
- `assets/js/main.js`: Interactions (mobile nav, smooth scroll, demo form handling)
- `assets/img/`: Place your images (e.g., `dr-xyz.jpg`)

## Customize
- Replace placeholder content for Dr. XYZ (qualifications, experience) in `index.html`.
- Update clinic details (address, phone, email, hours) in Contact and Booking sections.
- Replace map embed `src` with your precise Google Maps place link if desired.
- Add real images inside `assets/img/` and reference them in the markup.
- Connect forms to your backend or a service (e.g., Formspree, Netlify, Make/Zapier). For static-only, the current JS shows a confirmation alert.

## Color palette
- Calming teal tones: `--primary: #1e7a78`, accents with soft aqua.

## License
- MIT
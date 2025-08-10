// Mobile nav toggle
const navToggle = document.querySelector('.nav-toggle');
const siteNav = document.querySelector('.site-nav');
if (navToggle && siteNav) {
  navToggle.addEventListener('click', () => {
    const isOpen = siteNav.classList.toggle('open');
    navToggle.setAttribute('aria-expanded', String(isOpen));
  });
}

// Smooth scrolling for in-page anchors
const internalLinks = document.querySelectorAll('a[href^="#"]');
internalLinks.forEach((link) => {
  link.addEventListener('click', (e) => {
    const targetId = link.getAttribute('href');
    if (!targetId || targetId === '#' || !document.querySelector(targetId)) return;
    e.preventDefault();
    document.querySelector(targetId).scrollIntoView({ behavior: 'smooth', block: 'start' });
    if (siteNav) siteNav.classList.remove('open');
    if (navToggle) navToggle.setAttribute('aria-expanded', 'false');
  });
});

// Footer year
const yearSpan = document.getElementById('year');
if (yearSpan) {
  yearSpan.textContent = new Date().getFullYear().toString();
}

// Forms: demo-only handler
function attachFormHandler(selector) {
  const form = document.querySelector(selector);
  if (!form) return;
  form.addEventListener('submit', (e) => {
    e.preventDefault();
    const formData = new FormData(form);
    const entries = Array.from(formData.entries()).map(([k, v]) => `${k}: ${v}`).join('\n');
    alert(`Thank you! We have received your details.\n\n${entries}\n\nWe will contact you shortly.`);
    form.reset();
  });
}

attachFormHandler('form[name="contact"]');
attachFormHandler('#booking-form');
class CeilingFanPullChain
{
    private State m_current_state;

    public CeilingFanPullChain()
    {
        m_current_state = new Off();
    }
    public void set_state(State s)
    {
        m_current_state = s;
    }
    public void pull()
    {
        m_current_state.pull(this);
    }
}
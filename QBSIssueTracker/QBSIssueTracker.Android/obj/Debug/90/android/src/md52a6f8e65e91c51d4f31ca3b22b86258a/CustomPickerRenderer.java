package md52a6f8e65e91c51d4f31ca3b22b86258a;


public class CustomPickerRenderer
	extends md51558244f76c53b6aeda52c8a337f2c37.PickerRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("QBSIssueTracker.Droid.CustomRenderers.CustomPickerRenderer, QBSIssueTracker.Android", CustomPickerRenderer.class, __md_methods);
	}


	public CustomPickerRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CustomPickerRenderer.class)
			mono.android.TypeManager.Activate ("QBSIssueTracker.Droid.CustomRenderers.CustomPickerRenderer, QBSIssueTracker.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CustomPickerRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CustomPickerRenderer.class)
			mono.android.TypeManager.Activate ("QBSIssueTracker.Droid.CustomRenderers.CustomPickerRenderer, QBSIssueTracker.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public CustomPickerRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CustomPickerRenderer.class)
			mono.android.TypeManager.Activate ("QBSIssueTracker.Droid.CustomRenderers.CustomPickerRenderer, QBSIssueTracker.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

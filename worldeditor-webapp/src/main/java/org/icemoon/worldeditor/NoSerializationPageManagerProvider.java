package org.icemoon.worldeditor;

import java.io.Serializable;

import org.apache.wicket.DefaultPageManagerProvider;
import org.apache.wicket.page.IManageablePage;
import org.apache.wicket.pageStore.IDataStore;
import org.apache.wicket.pageStore.IPageStore;

public class NoSerializationPageManagerProvider extends DefaultPageManagerProvider {

	public NoSerializationPageManagerProvider(Application application) {
		super(application);
	}

	@Override
	protected IPageStore newPageStore(IDataStore dataStore) {
		return new IPageStore() {
			@Override
			public void destroy() {
			}

			@Override
			public IManageablePage getPage(String sessionId, int pageId) {
				return null;
			}

			@Override
			public void removePage(String sessionId, int pageId) {
			}

			@Override
			public void storePage(String sessionId, IManageablePage page) {
			}

			@Override
			public void unbind(String sessionId) {
			}

			@Override
			public Serializable prepareForSerialization(String sessionId, Object page) {
				return null;
			}

			@Override
			public Object restoreAfterSerialization(Serializable serializable) {
				return null;
			}

			@Override
			public IManageablePage convertToPage(Object page) {
				return null;
			}
		};

	}
}
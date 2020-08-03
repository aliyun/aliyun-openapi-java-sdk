/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListListenersByIpResponse;
import com.aliyuncs.mse.model.v20190531.ListListenersByIpResponse.Listener;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListListenersByIpResponseUnmarshaller {

	public static ListListenersByIpResponse unmarshall(ListListenersByIpResponse listListenersByIpResponse, UnmarshallerContext _ctx) {
		
		listListenersByIpResponse.setRequestId(_ctx.stringValue("ListListenersByIpResponse.RequestId"));
		listListenersByIpResponse.setSuccess(_ctx.booleanValue("ListListenersByIpResponse.Success"));
		listListenersByIpResponse.setMessage(_ctx.stringValue("ListListenersByIpResponse.Message"));
		listListenersByIpResponse.setErrorCode(_ctx.stringValue("ListListenersByIpResponse.ErrorCode"));
		listListenersByIpResponse.setPageNumber(_ctx.integerValue("ListListenersByIpResponse.PageNumber"));
		listListenersByIpResponse.setPageSize(_ctx.integerValue("ListListenersByIpResponse.PageSize"));
		listListenersByIpResponse.setTotalCount(_ctx.integerValue("ListListenersByIpResponse.TotalCount"));
		listListenersByIpResponse.setHttpCode(_ctx.stringValue("ListListenersByIpResponse.HttpCode"));

		List<Listener> listeners = new ArrayList<Listener>();
		for (int i = 0; i < _ctx.lengthValue("ListListenersByIpResponse.Listeners.Length"); i++) {
			Listener listener = new Listener();
			listener.setDataId(_ctx.stringValue("ListListenersByIpResponse.Listeners["+ i +"].DataId"));
			listener.setGroup(_ctx.stringValue("ListListenersByIpResponse.Listeners["+ i +"].Group"));
			listener.setMd5(_ctx.stringValue("ListListenersByIpResponse.Listeners["+ i +"].Md5"));

			listeners.add(listener);
		}
		listListenersByIpResponse.setListeners(listeners);
	 
	 	return listListenersByIpResponse;
	}
}
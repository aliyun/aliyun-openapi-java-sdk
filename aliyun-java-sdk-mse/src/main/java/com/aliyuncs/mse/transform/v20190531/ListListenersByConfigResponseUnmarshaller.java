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

import com.aliyuncs.mse.model.v20190531.ListListenersByConfigResponse;
import com.aliyuncs.mse.model.v20190531.ListListenersByConfigResponse.Listener;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListListenersByConfigResponseUnmarshaller {

	public static ListListenersByConfigResponse unmarshall(ListListenersByConfigResponse listListenersByConfigResponse, UnmarshallerContext _ctx) {
		
		listListenersByConfigResponse.setRequestId(_ctx.stringValue("ListListenersByConfigResponse.RequestId"));
		listListenersByConfigResponse.setHttpCode(_ctx.stringValue("ListListenersByConfigResponse.HttpCode"));
		listListenersByConfigResponse.setTotalCount(_ctx.integerValue("ListListenersByConfigResponse.TotalCount"));
		listListenersByConfigResponse.setMessage(_ctx.stringValue("ListListenersByConfigResponse.Message"));
		listListenersByConfigResponse.setPageSize(_ctx.integerValue("ListListenersByConfigResponse.PageSize"));
		listListenersByConfigResponse.setPageNumber(_ctx.integerValue("ListListenersByConfigResponse.PageNumber"));
		listListenersByConfigResponse.setErrorCode(_ctx.stringValue("ListListenersByConfigResponse.ErrorCode"));
		listListenersByConfigResponse.setSuccess(_ctx.booleanValue("ListListenersByConfigResponse.Success"));

		List<Listener> listeners = new ArrayList<Listener>();
		for (int i = 0; i < _ctx.lengthValue("ListListenersByConfigResponse.Listeners.Length"); i++) {
			Listener listener = new Listener();
			listener.setIp(_ctx.stringValue("ListListenersByConfigResponse.Listeners["+ i +"].Ip"));
			listener.setMd5(_ctx.stringValue("ListListenersByConfigResponse.Listeners["+ i +"].Md5"));

			listeners.add(listener);
		}
		listListenersByConfigResponse.setListeners(listeners);
	 
	 	return listListenersByConfigResponse;
	}
}
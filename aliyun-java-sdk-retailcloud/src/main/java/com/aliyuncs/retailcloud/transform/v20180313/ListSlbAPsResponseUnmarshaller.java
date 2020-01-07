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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListSlbAPsResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListSlbAPsResponse.SlbAPInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSlbAPsResponseUnmarshaller {

	public static ListSlbAPsResponse unmarshall(ListSlbAPsResponse listSlbAPsResponse, UnmarshallerContext _ctx) {
		
		listSlbAPsResponse.setRequestId(_ctx.stringValue("ListSlbAPsResponse.RequestId"));
		listSlbAPsResponse.setCode(_ctx.integerValue("ListSlbAPsResponse.Code"));
		listSlbAPsResponse.setErrorMsg(_ctx.stringValue("ListSlbAPsResponse.ErrorMsg"));
		listSlbAPsResponse.setPageNumber(_ctx.integerValue("ListSlbAPsResponse.PageNumber"));
		listSlbAPsResponse.setPageSize(_ctx.integerValue("ListSlbAPsResponse.PageSize"));
		listSlbAPsResponse.setTotalCount(_ctx.longValue("ListSlbAPsResponse.TotalCount"));

		List<SlbAPInstance> data = new ArrayList<SlbAPInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListSlbAPsResponse.Data.Length"); i++) {
			SlbAPInstance slbAPInstance = new SlbAPInstance();
			slbAPInstance.setAppId(_ctx.longValue("ListSlbAPsResponse.Data["+ i +"].AppId"));
			slbAPInstance.setCookieTimeout(_ctx.integerValue("ListSlbAPsResponse.Data["+ i +"].CookieTimeout"));
			slbAPInstance.setEnvId(_ctx.longValue("ListSlbAPsResponse.Data["+ i +"].EnvId"));
			slbAPInstance.setEstablishedTimeout(_ctx.integerValue("ListSlbAPsResponse.Data["+ i +"].EstablishedTimeout"));
			slbAPInstance.setListenerPort(_ctx.integerValue("ListSlbAPsResponse.Data["+ i +"].ListenerPort"));
			slbAPInstance.setName(_ctx.stringValue("ListSlbAPsResponse.Data["+ i +"].Name"));
			slbAPInstance.setNetworkMode(_ctx.stringValue("ListSlbAPsResponse.Data["+ i +"].NetworkMode"));
			slbAPInstance.setBizProtocol(_ctx.stringValue("ListSlbAPsResponse.Data["+ i +"].Protocol"));
			slbAPInstance.setRealServerPort(_ctx.integerValue("ListSlbAPsResponse.Data["+ i +"].RealServerPort"));
			slbAPInstance.setSlbAPId(_ctx.longValue("ListSlbAPsResponse.Data["+ i +"].SlbAPId"));
			slbAPInstance.setSlbId(_ctx.stringValue("ListSlbAPsResponse.Data["+ i +"].SlbId"));
			slbAPInstance.setSlbIp(_ctx.stringValue("ListSlbAPsResponse.Data["+ i +"].SlbIp"));
			slbAPInstance.setSslCertId(_ctx.stringValue("ListSlbAPsResponse.Data["+ i +"].SslCertId"));
			slbAPInstance.setStickySession(_ctx.integerValue("ListSlbAPsResponse.Data["+ i +"].StickySession"));

			data.add(slbAPInstance);
		}
		listSlbAPsResponse.setData(data);
	 
	 	return listSlbAPsResponse;
	}
}
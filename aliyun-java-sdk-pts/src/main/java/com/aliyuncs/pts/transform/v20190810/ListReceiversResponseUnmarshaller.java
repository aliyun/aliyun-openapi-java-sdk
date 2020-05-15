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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.ListReceiversResponse;
import com.aliyuncs.pts.model.v20190810.ListReceiversResponse.Receiver;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListReceiversResponseUnmarshaller {

	public static ListReceiversResponse unmarshall(ListReceiversResponse listReceiversResponse, UnmarshallerContext _ctx) {
		
		listReceiversResponse.setRequestId(_ctx.stringValue("ListReceiversResponse.RequestId"));
		listReceiversResponse.setCode(_ctx.stringValue("ListReceiversResponse.Code"));
		listReceiversResponse.setMessage(_ctx.stringValue("ListReceiversResponse.Message"));
		listReceiversResponse.setHttpStatusCode(_ctx.integerValue("ListReceiversResponse.HttpStatusCode"));
		listReceiversResponse.setSuccess(_ctx.booleanValue("ListReceiversResponse.Success"));

		List<Receiver> receivers = new ArrayList<Receiver>();
		for (int i = 0; i < _ctx.lengthValue("ListReceiversResponse.Receivers.Length"); i++) {
			Receiver receiver = new Receiver();
			receiver.setId(_ctx.stringValue("ListReceiversResponse.Receivers["+ i +"].Id"));
			receiver.setName(_ctx.stringValue("ListReceiversResponse.Receivers["+ i +"].Name"));
			receiver.setEmailCheckCode(_ctx.stringValue("ListReceiversResponse.Receivers["+ i +"].EmailCheckCode"));
			receiver.setMobileCheckCode(_ctx.stringValue("ListReceiversResponse.Receivers["+ i +"].MobileCheckCode"));
			receiver.setDingTalk(_ctx.stringValue("ListReceiversResponse.Receivers["+ i +"].DingTalk"));
			receiver.setMobile(_ctx.stringValue("ListReceiversResponse.Receivers["+ i +"].Mobile"));
			receiver.setSource(_ctx.stringValue("ListReceiversResponse.Receivers["+ i +"].Source"));
			receiver.setDeleted(_ctx.integerValue("ListReceiversResponse.Receivers["+ i +"].Deleted"));
			receiver.setEmail(_ctx.stringValue("ListReceiversResponse.Receivers["+ i +"].Email"));
			receiver.setWangwang(_ctx.stringValue("ListReceiversResponse.Receivers["+ i +"].Wangwang"));
			receiver.setUid(_ctx.stringValue("ListReceiversResponse.Receivers["+ i +"].Uid"));

			receivers.add(receiver);
		}
		listReceiversResponse.setReceivers(receivers);
	 
	 	return listReceiversResponse;
	}
}
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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListMsSgServicePubsResponse;
import com.aliyuncs.sofa.model.v20190815.ListMsSgServicePubsResponse.PublishersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMsSgServicePubsResponseUnmarshaller {

	public static ListMsSgServicePubsResponse unmarshall(ListMsSgServicePubsResponse listMsSgServicePubsResponse, UnmarshallerContext _ctx) {
		
		listMsSgServicePubsResponse.setRequestId(_ctx.stringValue("ListMsSgServicePubsResponse.RequestId"));
		listMsSgServicePubsResponse.setResultCode(_ctx.stringValue("ListMsSgServicePubsResponse.ResultCode"));
		listMsSgServicePubsResponse.setResultMessage(_ctx.stringValue("ListMsSgServicePubsResponse.ResultMessage"));

		List<PublishersItem> publishers = new ArrayList<PublishersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMsSgServicePubsResponse.Publishers.Length"); i++) {
			PublishersItem publishersItem = new PublishersItem();
			publishersItem.setAlive(_ctx.booleanValue("ListMsSgServicePubsResponse.Publishers["+ i +"].Alive"));
			publishersItem.setAppName(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].AppName"));
			publishersItem.setAppVersion(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].AppVersion"));
			publishersItem.setCheckSum(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].CheckSum"));
			publishersItem.setConfigWeight(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].ConfigWeight"));
			publishersItem.setContent(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].Content"));
			publishersItem.setDataId(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].DataId"));
			publishersItem.setHostIp(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].HostIp"));
			publishersItem.setId(_ctx.longValue("ListMsSgServicePubsResponse.Publishers["+ i +"].Id"));
			publishersItem.setInstanceId(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].InstanceId"));
			publishersItem.setMosn(_ctx.booleanValue("ListMsSgServicePubsResponse.Publishers["+ i +"].Mosn"));
			publishersItem.setProcessId(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].ProcessId"));
			publishersItem.setBizProtocol(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].Protocol"));
			publishersItem.setServiceIp(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].ServiceIp"));
			publishersItem.setServicePort(_ctx.longValue("ListMsSgServicePubsResponse.Publishers["+ i +"].ServicePort"));
			publishersItem.setStatus(_ctx.booleanValue("ListMsSgServicePubsResponse.Publishers["+ i +"].Status"));
			publishersItem.setTimeout(_ctx.longValue("ListMsSgServicePubsResponse.Publishers["+ i +"].Timeout"));
			publishersItem.setVmMode(_ctx.booleanValue("ListMsSgServicePubsResponse.Publishers["+ i +"].VmMode"));
			publishersItem.setWeight(_ctx.longValue("ListMsSgServicePubsResponse.Publishers["+ i +"].Weight"));
			publishersItem.setZone(_ctx.stringValue("ListMsSgServicePubsResponse.Publishers["+ i +"].Zone"));

			publishers.add(publishersItem);
		}
		listMsSgServicePubsResponse.setPublishers(publishers);
	 
	 	return listMsSgServicePubsResponse;
	}
}
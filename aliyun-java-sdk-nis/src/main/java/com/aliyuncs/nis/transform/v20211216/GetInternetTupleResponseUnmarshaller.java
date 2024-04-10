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

package com.aliyuncs.nis.transform.v20211216;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nis.model.v20211216.GetInternetTupleResponse;
import com.aliyuncs.nis.model.v20211216.GetInternetTupleResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInternetTupleResponseUnmarshaller {

	public static GetInternetTupleResponse unmarshall(GetInternetTupleResponse getInternetTupleResponse, UnmarshallerContext _ctx) {
		
		getInternetTupleResponse.setRequestId(_ctx.stringValue("GetInternetTupleResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInternetTupleResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBeginTime(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].BeginTime"));
			dataItem.setDirection(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].Direction"));
			dataItem.setInstanceId(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].InstanceId"));
			dataItem.setAccessRegion(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].AccessRegion"));
			dataItem.setCloudIp(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].CloudIp"));
			dataItem.setCloudPort(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].CloudPort"));
			dataItem.setOtherIp(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].OtherIp"));
			dataItem.setOtherPort(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].OtherPort"));
			dataItem.setBizProtocol(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].Protocol"));
			dataItem.setCloudCountry(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].CloudCountry"));
			dataItem.setCloudProvince(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].CloudProvince"));
			dataItem.setCloudCity(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].CloudCity"));
			dataItem.setCloudIsp(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].CloudIsp"));
			dataItem.setCloudProduct(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].CloudProduct"));
			dataItem.setOtherCountry(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].OtherCountry"));
			dataItem.setOtherProvince(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].OtherProvince"));
			dataItem.setOtherCity(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].OtherCity"));
			dataItem.setOtherIsp(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].OtherIsp"));
			dataItem.setOtherProduct(_ctx.stringValue("GetInternetTupleResponse.Data["+ i +"].OtherProduct"));
			dataItem.setRtt(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].Rtt"));
			dataItem.setByteCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].ByteCount"));
			dataItem.setPacketCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].PacketCount"));
			dataItem.setOutOrderCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].OutOrderCount"));
			dataItem.setRetranCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].RetranCount"));
			dataItem.setInByteCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].InByteCount"));
			dataItem.setOutByteCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].OutByteCount"));
			dataItem.setInPacketCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].InPacketCount"));
			dataItem.setOutPacketCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].OutPacketCount"));
			dataItem.setInOutOrderCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].InOutOrderCount"));
			dataItem.setOutOutOrderCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].OutOutOrderCount"));
			dataItem.setInRetranCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].InRetranCount"));
			dataItem.setOutRetranCount(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].OutRetranCount"));
			dataItem.setRetransmitRate(_ctx.doubleValue("GetInternetTupleResponse.Data["+ i +"].RetransmitRate"));

			data.add(dataItem);
		}
		getInternetTupleResponse.setData(data);
	 
	 	return getInternetTupleResponse;
	}
}
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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListSlbResponse;
import com.aliyuncs.edas.model.v20170801.ListSlbResponse.SlbEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSlbResponseUnmarshaller {

	public static ListSlbResponse unmarshall(ListSlbResponse listSlbResponse, UnmarshallerContext _ctx) {
		
		listSlbResponse.setRequestId(_ctx.stringValue("ListSlbResponse.RequestId"));
		listSlbResponse.setCode(_ctx.integerValue("ListSlbResponse.Code"));
		listSlbResponse.setMessage(_ctx.stringValue("ListSlbResponse.Message"));

		List<SlbEntity> slbList = new ArrayList<SlbEntity>();
		for (int i = 0; i < _ctx.lengthValue("ListSlbResponse.SlbList.Length"); i++) {
			SlbEntity slbEntity = new SlbEntity();
			slbEntity.setSlbId(_ctx.stringValue("ListSlbResponse.SlbList["+ i +"].SlbId"));
			slbEntity.setSlbName(_ctx.stringValue("ListSlbResponse.SlbList["+ i +"].SlbName"));
			slbEntity.setRegionId(_ctx.stringValue("ListSlbResponse.SlbList["+ i +"].RegionId"));
			slbEntity.setUserId(_ctx.stringValue("ListSlbResponse.SlbList["+ i +"].UserId"));
			slbEntity.setAddress(_ctx.stringValue("ListSlbResponse.SlbList["+ i +"].Address"));
			slbEntity.setSlbStatus(_ctx.stringValue("ListSlbResponse.SlbList["+ i +"].SlbStatus"));
			slbEntity.setAddressType(_ctx.stringValue("ListSlbResponse.SlbList["+ i +"].AddressType"));
			slbEntity.setVswitchId(_ctx.stringValue("ListSlbResponse.SlbList["+ i +"].VswitchId"));
			slbEntity.setVpcId(_ctx.stringValue("ListSlbResponse.SlbList["+ i +"].VpcId"));
			slbEntity.setNetworkType(_ctx.stringValue("ListSlbResponse.SlbList["+ i +"].NetworkType"));
			slbEntity.setGroupId(_ctx.integerValue("ListSlbResponse.SlbList["+ i +"].GroupId"));
			slbEntity.setExpired(_ctx.booleanValue("ListSlbResponse.SlbList["+ i +"].Expired"));

			slbList.add(slbEntity);
		}
		listSlbResponse.setSlbList(slbList);
	 
	 	return listSlbResponse;
	}
}
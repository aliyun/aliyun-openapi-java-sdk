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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.ModifyInstanceNetExpireTimeResponse;
import com.aliyuncs.r_kvstore.model.v20150101.ModifyInstanceNetExpireTimeResponse.NetInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceNetExpireTimeResponseUnmarshaller {

	public static ModifyInstanceNetExpireTimeResponse unmarshall(ModifyInstanceNetExpireTimeResponse modifyInstanceNetExpireTimeResponse, UnmarshallerContext _ctx) {
		
		modifyInstanceNetExpireTimeResponse.setRequestId(_ctx.stringValue("ModifyInstanceNetExpireTimeResponse.RequestId"));
		modifyInstanceNetExpireTimeResponse.setInstanceId(_ctx.stringValue("ModifyInstanceNetExpireTimeResponse.InstanceId"));

		List<NetInfoItem> netInfoItems = new ArrayList<NetInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyInstanceNetExpireTimeResponse.NetInfoItems.Length"); i++) {
			NetInfoItem netInfoItem = new NetInfoItem();
			netInfoItem.setDBInstanceNetType(_ctx.stringValue("ModifyInstanceNetExpireTimeResponse.NetInfoItems["+ i +"].DBInstanceNetType"));
			netInfoItem.setPort(_ctx.stringValue("ModifyInstanceNetExpireTimeResponse.NetInfoItems["+ i +"].Port"));
			netInfoItem.setExpiredTime(_ctx.stringValue("ModifyInstanceNetExpireTimeResponse.NetInfoItems["+ i +"].ExpiredTime"));
			netInfoItem.setConnectionString(_ctx.stringValue("ModifyInstanceNetExpireTimeResponse.NetInfoItems["+ i +"].ConnectionString"));
			netInfoItem.setIPAddress(_ctx.stringValue("ModifyInstanceNetExpireTimeResponse.NetInfoItems["+ i +"].IPAddress"));

			netInfoItems.add(netInfoItem);
		}
		modifyInstanceNetExpireTimeResponse.setNetInfoItems(netInfoItems);
	 
	 	return modifyInstanceNetExpireTimeResponse;
	}
}
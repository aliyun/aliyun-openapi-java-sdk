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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.CreateHighReliablePhysicalConnectionResponse;
import com.aliyuncs.vpc.model.v20160428.CreateHighReliablePhysicalConnectionResponse.ErrorInfoListItem;
import com.aliyuncs.vpc.model.v20160428.CreateHighReliablePhysicalConnectionResponse.PhysicalConnectionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHighReliablePhysicalConnectionResponseUnmarshaller {

	public static CreateHighReliablePhysicalConnectionResponse unmarshall(CreateHighReliablePhysicalConnectionResponse createHighReliablePhysicalConnectionResponse, UnmarshallerContext _ctx) {
		
		createHighReliablePhysicalConnectionResponse.setRequestId(_ctx.stringValue("CreateHighReliablePhysicalConnectionResponse.RequestId"));

		List<PhysicalConnectionListItem> physicalConnectionList = new ArrayList<PhysicalConnectionListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateHighReliablePhysicalConnectionResponse.PhysicalConnectionList.Length"); i++) {
			PhysicalConnectionListItem physicalConnectionListItem = new PhysicalConnectionListItem();
			physicalConnectionListItem.setInstanceId(_ctx.stringValue("CreateHighReliablePhysicalConnectionResponse.PhysicalConnectionList["+ i +"].InstanceId"));
			physicalConnectionListItem.setRegionNo(_ctx.stringValue("CreateHighReliablePhysicalConnectionResponse.PhysicalConnectionList["+ i +"].RegionNo"));

			physicalConnectionList.add(physicalConnectionListItem);
		}
		createHighReliablePhysicalConnectionResponse.setPhysicalConnectionList(physicalConnectionList);

		List<ErrorInfoListItem> errorInfoList = new ArrayList<ErrorInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateHighReliablePhysicalConnectionResponse.ErrorInfoList.Length"); i++) {
			ErrorInfoListItem errorInfoListItem = new ErrorInfoListItem();
			errorInfoListItem.setErrorCode(_ctx.stringValue("CreateHighReliablePhysicalConnectionResponse.ErrorInfoList["+ i +"].ErrorCode"));
			errorInfoListItem.setErrorMessage(_ctx.stringValue("CreateHighReliablePhysicalConnectionResponse.ErrorInfoList["+ i +"].ErrorMessage"));
			errorInfoListItem.setInstanceId(_ctx.stringValue("CreateHighReliablePhysicalConnectionResponse.ErrorInfoList["+ i +"].InstanceId"));

			errorInfoList.add(errorInfoListItem);
		}
		createHighReliablePhysicalConnectionResponse.setErrorInfoList(errorInfoList);
	 
	 	return createHighReliablePhysicalConnectionResponse;
	}
}
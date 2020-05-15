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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.FindPrepublishesByVersionIdResponse;
import com.aliyuncs.iovcc.model.v20180501.FindPrepublishesByVersionIdResponse.PrepublishListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindPrepublishesByVersionIdResponseUnmarshaller {

	public static FindPrepublishesByVersionIdResponse unmarshall(FindPrepublishesByVersionIdResponse findPrepublishesByVersionIdResponse, UnmarshallerContext _ctx) {
		
		findPrepublishesByVersionIdResponse.setRequestId(_ctx.stringValue("FindPrepublishesByVersionIdResponse.RequestId"));

		List<PrepublishListItem> prepublishList = new ArrayList<PrepublishListItem>();
		for (int i = 0; i < _ctx.lengthValue("FindPrepublishesByVersionIdResponse.PrepublishList.Length"); i++) {
			PrepublishListItem prepublishListItem = new PrepublishListItem();
			prepublishListItem.setId(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].Id"));
			prepublishListItem.setName(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].Name"));
			prepublishListItem.setVersionType(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].VersionType"));
			prepublishListItem.setVersionId(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].VersionId"));
			prepublishListItem.setBarrierCount(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].BarrierCount"));
			prepublishListItem.setDeviceModelId(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].DeviceModelId"));
			prepublishListItem.setParentId(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].ParentId"));
			prepublishListItem.setIsActive(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].IsActive"));
			prepublishListItem.setIsTotalPrepublish(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].IsTotalPrepublish"));
			prepublishListItem.setGmtCreate(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].GmtCreate"));
			prepublishListItem.setGmtModify(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].GmtModify"));
			prepublishListItem.setDeviceModelName(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].DeviceModelName"));
			prepublishListItem.setPassedCount(_ctx.stringValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].PassedCount"));
			prepublishListItem.setGmtCreateTimestamp(_ctx.longValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].GmtCreateTimestamp"));
			prepublishListItem.setGmtModifyTimestamp(_ctx.longValue("FindPrepublishesByVersionIdResponse.PrepublishList["+ i +"].GmtModifyTimestamp"));

			prepublishList.add(prepublishListItem);
		}
		findPrepublishesByVersionIdResponse.setPrepublishList(prepublishList);
	 
	 	return findPrepublishesByVersionIdResponse;
	}
}
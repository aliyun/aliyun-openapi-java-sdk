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

package com.aliyuncs.ivpd.transform.v20190625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivpd.model.v20190625.GetUserBucketConfigResponse;
import com.aliyuncs.ivpd.model.v20190625.GetUserBucketConfigResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserBucketConfigResponseUnmarshaller {

	public static GetUserBucketConfigResponse unmarshall(GetUserBucketConfigResponse getUserBucketConfigResponse, UnmarshallerContext _ctx) {
		
		getUserBucketConfigResponse.setRequestId(_ctx.stringValue("GetUserBucketConfigResponse.RequestId"));
		getUserBucketConfigResponse.setCode(_ctx.stringValue("GetUserBucketConfigResponse.Code"));
		getUserBucketConfigResponse.setMessage(_ctx.stringValue("GetUserBucketConfigResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserBucketConfigResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegion(_ctx.stringValue("GetUserBucketConfigResponse.Data["+ i +"].Region"));
			dataItem.setRegionName(_ctx.stringValue("GetUserBucketConfigResponse.Data["+ i +"].RegionName"));
			dataItem.setBucket(_ctx.stringValue("GetUserBucketConfigResponse.Data["+ i +"].Bucket"));

			data.add(dataItem);
		}
		getUserBucketConfigResponse.setData(data);
	 
	 	return getUserBucketConfigResponse;
	}
}
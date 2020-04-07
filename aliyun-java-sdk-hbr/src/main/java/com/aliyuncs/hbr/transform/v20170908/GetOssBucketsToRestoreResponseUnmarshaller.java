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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.GetOssBucketsToRestoreResponse;
import com.aliyuncs.hbr.model.v20170908.GetOssBucketsToRestoreResponse.OssBucket;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOssBucketsToRestoreResponseUnmarshaller {

	public static GetOssBucketsToRestoreResponse unmarshall(GetOssBucketsToRestoreResponse getOssBucketsToRestoreResponse, UnmarshallerContext _ctx) {
		
		getOssBucketsToRestoreResponse.setRequestId(_ctx.stringValue("GetOssBucketsToRestoreResponse.RequestId"));
		getOssBucketsToRestoreResponse.setSuccess(_ctx.booleanValue("GetOssBucketsToRestoreResponse.Success"));
		getOssBucketsToRestoreResponse.setCode(_ctx.stringValue("GetOssBucketsToRestoreResponse.Code"));
		getOssBucketsToRestoreResponse.setMessage(_ctx.stringValue("GetOssBucketsToRestoreResponse.Message"));
		getOssBucketsToRestoreResponse.setTotalCount(_ctx.longValue("GetOssBucketsToRestoreResponse.TotalCount"));
		getOssBucketsToRestoreResponse.setPageSize(_ctx.integerValue("GetOssBucketsToRestoreResponse.PageSize"));
		getOssBucketsToRestoreResponse.setPageNumber(_ctx.integerValue("GetOssBucketsToRestoreResponse.PageNumber"));

		List<OssBucket> ossBuckets = new ArrayList<OssBucket>();
		for (int i = 0; i < _ctx.lengthValue("GetOssBucketsToRestoreResponse.OssBuckets.Length"); i++) {
			OssBucket ossBucket = new OssBucket();
			ossBucket.setBucket(_ctx.stringValue("GetOssBucketsToRestoreResponse.OssBuckets["+ i +"].Bucket"));

			ossBuckets.add(ossBucket);
		}
		getOssBucketsToRestoreResponse.setOssBuckets(ossBuckets);
	 
	 	return getOssBucketsToRestoreResponse;
	}
}
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

package com.aliyuncs.mns.transform.v20210319;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.ListBucketResponse;
import com.aliyuncs.mns.model.v20210319.ListBucketResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBucketResponseUnmarshaller {

	public static ListBucketResponse unmarshall(ListBucketResponse listBucketResponse, UnmarshallerContext _ctx) {
		
		listBucketResponse.setRequestId(_ctx.stringValue("ListBucketResponse.RequestId"));
		listBucketResponse.setCode(_ctx.longValue("ListBucketResponse.Code"));
		listBucketResponse.setStatus(_ctx.stringValue("ListBucketResponse.Status"));
		listBucketResponse.setMessage(_ctx.stringValue("ListBucketResponse.Message"));
		listBucketResponse.setSuccess(_ctx.booleanValue("ListBucketResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBucketResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBucketId(_ctx.stringValue("ListBucketResponse.Data["+ i +"].BucketId"));
			dataItem.setBucketName(_ctx.stringValue("ListBucketResponse.Data["+ i +"].BucketName"));
			dataItem.setBucketAcl(_ctx.stringValue("ListBucketResponse.Data["+ i +"].BucketAcl"));

			data.add(dataItem);
		}
		listBucketResponse.setData(data);
	 
	 	return listBucketResponse;
	}
}
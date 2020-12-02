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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.GetModelSignedUrlResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetModelSignedUrlResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetModelSignedUrlResponseUnmarshaller {

	public static GetModelSignedUrlResponse unmarshall(GetModelSignedUrlResponse getModelSignedUrlResponse, UnmarshallerContext _ctx) {
		
		getModelSignedUrlResponse.setRequestId(_ctx.stringValue("GetModelSignedUrlResponse.RequestId"));
		getModelSignedUrlResponse.setCode(_ctx.stringValue("GetModelSignedUrlResponse.Code"));
		getModelSignedUrlResponse.setMessage(_ctx.stringValue("GetModelSignedUrlResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelSignedUrlResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setModelPath(_ctx.stringValue("GetModelSignedUrlResponse.Data["+ i +"].ModelPath"));
			dataItem.setPublicUrl(_ctx.stringValue("GetModelSignedUrlResponse.Data["+ i +"].PublicUrl"));
			dataItem.setMd5(_ctx.stringValue("GetModelSignedUrlResponse.Data["+ i +"].Md5"));

			data.add(dataItem);
		}
		getModelSignedUrlResponse.setData(data);
	 
	 	return getModelSignedUrlResponse;
	}
}
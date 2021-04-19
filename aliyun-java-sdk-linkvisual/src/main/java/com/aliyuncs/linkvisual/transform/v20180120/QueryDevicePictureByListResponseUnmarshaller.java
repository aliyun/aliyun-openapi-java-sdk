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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePictureByListResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePictureByListResponse.PicData;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePictureByListResponseUnmarshaller {

	public static QueryDevicePictureByListResponse unmarshall(QueryDevicePictureByListResponse queryDevicePictureByListResponse, UnmarshallerContext _ctx) {
		
		queryDevicePictureByListResponse.setRequestId(_ctx.stringValue("QueryDevicePictureByListResponse.RequestId"));
		queryDevicePictureByListResponse.setSuccess(_ctx.booleanValue("QueryDevicePictureByListResponse.Success"));
		queryDevicePictureByListResponse.setCode(_ctx.stringValue("QueryDevicePictureByListResponse.Code"));
		queryDevicePictureByListResponse.setErrorMessage(_ctx.stringValue("QueryDevicePictureByListResponse.ErrorMessage"));

		List<PicData> data = new ArrayList<PicData>();
		for (int i = 0; i < _ctx.lengthValue("QueryDevicePictureByListResponse.Data.Length"); i++) {
			PicData picData = new PicData();
			picData.setIotId(_ctx.stringValue("QueryDevicePictureByListResponse.Data["+ i +"].IotId"));
			picData.setPicCreateTime(_ctx.longValue("QueryDevicePictureByListResponse.Data["+ i +"].PicCreateTime"));
			picData.setPicId(_ctx.stringValue("QueryDevicePictureByListResponse.Data["+ i +"].PicId"));
			picData.setPicUrl(_ctx.stringValue("QueryDevicePictureByListResponse.Data["+ i +"].PicUrl"));
			picData.setThumbUrl(_ctx.stringValue("QueryDevicePictureByListResponse.Data["+ i +"].ThumbUrl"));

			data.add(picData);
		}
		queryDevicePictureByListResponse.setData(data);
	 
	 	return queryDevicePictureByListResponse;
	}
}
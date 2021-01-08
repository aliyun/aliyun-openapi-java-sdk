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

import com.aliyuncs.linkvisual.model.v20180120.GetPictureInfoWithVectorIdsResponse;
import com.aliyuncs.linkvisual.model.v20180120.GetPictureInfoWithVectorIdsResponse.LIst;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPictureInfoWithVectorIdsResponseUnmarshaller {

	public static GetPictureInfoWithVectorIdsResponse unmarshall(GetPictureInfoWithVectorIdsResponse getPictureInfoWithVectorIdsResponse, UnmarshallerContext _ctx) {
		
		getPictureInfoWithVectorIdsResponse.setRequestId(_ctx.stringValue("GetPictureInfoWithVectorIdsResponse.RequestId"));
		getPictureInfoWithVectorIdsResponse.setSuccess(_ctx.booleanValue("GetPictureInfoWithVectorIdsResponse.Success"));
		getPictureInfoWithVectorIdsResponse.setCode(_ctx.stringValue("GetPictureInfoWithVectorIdsResponse.Code"));
		getPictureInfoWithVectorIdsResponse.setErrorMessage(_ctx.stringValue("GetPictureInfoWithVectorIdsResponse.ErrorMessage"));

		List<LIst> data = new ArrayList<LIst>();
		for (int i = 0; i < _ctx.lengthValue("GetPictureInfoWithVectorIdsResponse.Data.Length"); i++) {
			LIst lIst = new LIst();
			lIst.setPicUrl(_ctx.stringValue("GetPictureInfoWithVectorIdsResponse.Data["+ i +"].PicUrl"));
			lIst.setIotId(_ctx.stringValue("GetPictureInfoWithVectorIdsResponse.Data["+ i +"].IotId"));
			lIst.setGatewayIotId(_ctx.stringValue("GetPictureInfoWithVectorIdsResponse.Data["+ i +"].GatewayIotId"));

			data.add(lIst);
		}
		getPictureInfoWithVectorIdsResponse.setData(data);
	 
	 	return getPictureInfoWithVectorIdsResponse;
	}
}
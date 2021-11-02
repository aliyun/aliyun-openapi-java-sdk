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

package com.aliyuncs.unimkt.transform.v20181207;

import com.aliyuncs.unimkt.model.v20181207.GetImageUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageUrlResponseUnmarshaller {

	public static GetImageUrlResponse unmarshall(GetImageUrlResponse getImageUrlResponse, UnmarshallerContext _ctx) {
		
		getImageUrlResponse.setRequestId(_ctx.stringValue("GetImageUrlResponse.RequestId"));
		getImageUrlResponse.setStatus(_ctx.booleanValue("GetImageUrlResponse.Status"));
		getImageUrlResponse.setMsg(_ctx.stringValue("GetImageUrlResponse.Msg"));
		getImageUrlResponse.setImageUrl(_ctx.stringValue("GetImageUrlResponse.ImageUrl"));
		getImageUrlResponse.setErrorCode(_ctx.stringValue("GetImageUrlResponse.ErrorCode"));
		getImageUrlResponse.setCreatedTime(_ctx.stringValue("GetImageUrlResponse.CreatedTime"));
		getImageUrlResponse.setUpdatedTime(_ctx.stringValue("GetImageUrlResponse.UpdatedTime"));
	 
	 	return getImageUrlResponse;
	}
}
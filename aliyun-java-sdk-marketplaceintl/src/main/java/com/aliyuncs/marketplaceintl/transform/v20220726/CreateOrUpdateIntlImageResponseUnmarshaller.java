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

package com.aliyuncs.marketplaceintl.transform.v20220726;

import com.aliyuncs.marketplaceintl.model.v20220726.CreateOrUpdateIntlImageResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.CreateOrUpdateIntlImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateIntlImageResponseUnmarshaller {

	public static CreateOrUpdateIntlImageResponse unmarshall(CreateOrUpdateIntlImageResponse createOrUpdateIntlImageResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateIntlImageResponse.setRequestId(_ctx.stringValue("CreateOrUpdateIntlImageResponse.RequestId"));
		createOrUpdateIntlImageResponse.setErrorCode(_ctx.stringValue("CreateOrUpdateIntlImageResponse.ErrorCode"));
		createOrUpdateIntlImageResponse.setCode(_ctx.integerValue("CreateOrUpdateIntlImageResponse.Code"));
		createOrUpdateIntlImageResponse.setMsg(_ctx.stringValue("CreateOrUpdateIntlImageResponse.Msg"));
		createOrUpdateIntlImageResponse.setSuccess(_ctx.booleanValue("CreateOrUpdateIntlImageResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.stringValue("CreateOrUpdateIntlImageResponse.Data.Code"));
		data.setTrackId(_ctx.stringValue("CreateOrUpdateIntlImageResponse.Data.TrackId"));
		createOrUpdateIntlImageResponse.setData(data);
	 
	 	return createOrUpdateIntlImageResponse;
	}
}
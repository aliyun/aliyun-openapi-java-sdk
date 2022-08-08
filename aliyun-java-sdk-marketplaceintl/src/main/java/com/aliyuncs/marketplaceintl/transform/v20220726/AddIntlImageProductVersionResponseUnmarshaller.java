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

import com.aliyuncs.marketplaceintl.model.v20220726.AddIntlImageProductVersionResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.AddIntlImageProductVersionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddIntlImageProductVersionResponseUnmarshaller {

	public static AddIntlImageProductVersionResponse unmarshall(AddIntlImageProductVersionResponse addIntlImageProductVersionResponse, UnmarshallerContext _ctx) {
		
		addIntlImageProductVersionResponse.setRequestId(_ctx.stringValue("AddIntlImageProductVersionResponse.RequestId"));
		addIntlImageProductVersionResponse.setErrorCode(_ctx.stringValue("AddIntlImageProductVersionResponse.ErrorCode"));
		addIntlImageProductVersionResponse.setCode(_ctx.integerValue("AddIntlImageProductVersionResponse.Code"));
		addIntlImageProductVersionResponse.setMsg(_ctx.stringValue("AddIntlImageProductVersionResponse.Msg"));
		addIntlImageProductVersionResponse.setSuccess(_ctx.booleanValue("AddIntlImageProductVersionResponse.Success"));

		Data data = new Data();
		data.setCommodityCode(_ctx.stringValue("AddIntlImageProductVersionResponse.Data.CommodityCode"));
		data.setTrackId(_ctx.stringValue("AddIntlImageProductVersionResponse.Data.TrackId"));
		addIntlImageProductVersionResponse.setData(data);
	 
	 	return addIntlImageProductVersionResponse;
	}
}
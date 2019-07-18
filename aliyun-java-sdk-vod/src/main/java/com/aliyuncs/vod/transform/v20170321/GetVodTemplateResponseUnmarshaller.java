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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetVodTemplateResponse;
import com.aliyuncs.vod.model.v20170321.GetVodTemplateResponse.VodTemplateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVodTemplateResponseUnmarshaller {

	public static GetVodTemplateResponse unmarshall(GetVodTemplateResponse getVodTemplateResponse, UnmarshallerContext _ctx) {
		
		getVodTemplateResponse.setRequestId(_ctx.stringValue("GetVodTemplateResponse.RequestId"));

		VodTemplateInfo vodTemplateInfo = new VodTemplateInfo();
		vodTemplateInfo.setName(_ctx.stringValue("GetVodTemplateResponse.VodTemplateInfo.Name"));
		vodTemplateInfo.setVodTemplateId(_ctx.stringValue("GetVodTemplateResponse.VodTemplateInfo.VodTemplateId"));
		vodTemplateInfo.setTemplateType(_ctx.stringValue("GetVodTemplateResponse.VodTemplateInfo.TemplateType"));
		vodTemplateInfo.setSubTemplateType(_ctx.stringValue("GetVodTemplateResponse.VodTemplateInfo.SubTemplateType"));
		vodTemplateInfo.setSource(_ctx.stringValue("GetVodTemplateResponse.VodTemplateInfo.Source"));
		vodTemplateInfo.setIsDefault(_ctx.stringValue("GetVodTemplateResponse.VodTemplateInfo.IsDefault"));
		vodTemplateInfo.setTemplateConfig(_ctx.stringValue("GetVodTemplateResponse.VodTemplateInfo.TemplateConfig"));
		vodTemplateInfo.setCreationTime(_ctx.stringValue("GetVodTemplateResponse.VodTemplateInfo.CreationTime"));
		vodTemplateInfo.setModifyTime(_ctx.stringValue("GetVodTemplateResponse.VodTemplateInfo.ModifyTime"));
		getVodTemplateResponse.setVodTemplateInfo(vodTemplateInfo);
	 
	 	return getVodTemplateResponse;
	}
}
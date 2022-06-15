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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.GetAudioFileResponse;
import com.aliyuncs.ccc.model.v20200701.GetAudioFileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAudioFileResponseUnmarshaller {

	public static GetAudioFileResponse unmarshall(GetAudioFileResponse getAudioFileResponse, UnmarshallerContext _ctx) {
		
		getAudioFileResponse.setRequestId(_ctx.stringValue("GetAudioFileResponse.RequestId"));
		getAudioFileResponse.setHttpStatusCode(_ctx.integerValue("GetAudioFileResponse.HttpStatusCode"));
		getAudioFileResponse.setCode(_ctx.stringValue("GetAudioFileResponse.Code"));
		getAudioFileResponse.setMessage(_ctx.stringValue("GetAudioFileResponse.Message"));
		getAudioFileResponse.setPublished(_ctx.booleanValue("GetAudioFileResponse.Published"));
		getAudioFileResponse.setMainFlow(_ctx.booleanValue("GetAudioFileResponse.MainFlow"));

		Data data = new Data();
		data.setAudioFileName(_ctx.stringValue("GetAudioFileResponse.Data.AudioFileName"));
		data.setOssFileKey(_ctx.stringValue("GetAudioFileResponse.Data.OssFileKey"));
		data.setUpdatedTime(_ctx.stringValue("GetAudioFileResponse.Data.UpdatedTime"));
		data.setAudioResourceId(_ctx.stringValue("GetAudioFileResponse.Data.AudioResourceId"));
		data.setInstanceId(_ctx.stringValue("GetAudioFileResponse.Data.InstanceId"));
		data.setName(_ctx.stringValue("GetAudioFileResponse.Data.Name"));
		data.setCreatedTime(_ctx.stringValue("GetAudioFileResponse.Data.CreatedTime"));
		getAudioFileResponse.setData(data);
	 
	 	return getAudioFileResponse;
	}
}
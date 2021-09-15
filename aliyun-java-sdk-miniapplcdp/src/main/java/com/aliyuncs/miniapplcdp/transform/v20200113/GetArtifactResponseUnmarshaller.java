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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.GetArtifactResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetArtifactResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetArtifactResponseUnmarshaller {

	public static GetArtifactResponse unmarshall(GetArtifactResponse getArtifactResponse, UnmarshallerContext _ctx) {
		
		getArtifactResponse.setRequestId(_ctx.stringValue("GetArtifactResponse.RequestId"));

		Data data = new Data();
		data.setArtifactId(_ctx.stringValue("GetArtifactResponse.Data.ArtifactId"));
		data.setModifiedTime(_ctx.stringValue("GetArtifactResponse.Data.ModifiedTime"));
		data.setAppId(_ctx.stringValue("GetArtifactResponse.Data.AppId"));
		data.setCreateTime(_ctx.stringValue("GetArtifactResponse.Data.CreateTime"));
		data.setArtifactType(_ctx.stringValue("GetArtifactResponse.Data.ArtifactType"));
		data.setAvailable(_ctx.booleanValue("GetArtifactResponse.Data.Available"));
		data.setUrl(_ctx.stringValue("GetArtifactResponse.Data.Url"));
		getArtifactResponse.setData(data);
	 
	 	return getArtifactResponse;
	}
}
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

package com.aliyuncs.pairecservice.transform.v20221213;

import com.aliyuncs.pairecservice.model.v20221213.GetLayerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLayerResponseUnmarshaller {

	public static GetLayerResponse unmarshall(GetLayerResponse getLayerResponse, UnmarshallerContext _ctx) {
		
		getLayerResponse.setRequestId(_ctx.stringValue("GetLayerResponse.RequestId"));
		getLayerResponse.setLaboratoryId(_ctx.stringValue("GetLayerResponse.LaboratoryId"));
		getLayerResponse.setSceneId(_ctx.stringValue("GetLayerResponse.SceneId"));
		getLayerResponse.setName(_ctx.stringValue("GetLayerResponse.Name"));
		getLayerResponse.setDescription(_ctx.stringValue("GetLayerResponse.Description"));
	 
	 	return getLayerResponse;
	}
}
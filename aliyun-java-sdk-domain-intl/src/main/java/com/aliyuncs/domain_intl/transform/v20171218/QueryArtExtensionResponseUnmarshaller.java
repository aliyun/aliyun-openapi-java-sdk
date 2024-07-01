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

package com.aliyuncs.domain_intl.transform.v20171218;

import com.aliyuncs.domain_intl.model.v20171218.QueryArtExtensionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryArtExtensionResponseUnmarshaller {

	public static QueryArtExtensionResponse unmarshall(QueryArtExtensionResponse queryArtExtensionResponse, UnmarshallerContext _ctx) {
		
		queryArtExtensionResponse.setRequestId(_ctx.stringValue("QueryArtExtensionResponse.RequestId"));
		queryArtExtensionResponse.setObjectType(_ctx.stringValue("QueryArtExtensionResponse.ObjectType"));
		queryArtExtensionResponse.setMaterialsAndTechniques(_ctx.stringValue("QueryArtExtensionResponse.MaterialsAndTechniques"));
		queryArtExtensionResponse.setInscriptionsAndMarkings(_ctx.stringValue("QueryArtExtensionResponse.InscriptionsAndMarkings"));
		queryArtExtensionResponse.setReference(_ctx.stringValue("QueryArtExtensionResponse.Reference"));
		queryArtExtensionResponse.setDateOrPeriod(_ctx.stringValue("QueryArtExtensionResponse.DateOrPeriod"));
		queryArtExtensionResponse.setDimensions(_ctx.stringValue("QueryArtExtensionResponse.Dimensions"));
		queryArtExtensionResponse.setTitle(_ctx.stringValue("QueryArtExtensionResponse.Title"));
		queryArtExtensionResponse.setFeatures(_ctx.stringValue("QueryArtExtensionResponse.Features"));
		queryArtExtensionResponse.setSubject(_ctx.stringValue("QueryArtExtensionResponse.Subject"));
		queryArtExtensionResponse.setMaker(_ctx.stringValue("QueryArtExtensionResponse.Maker"));
	 
	 	return queryArtExtensionResponse;
	}
}
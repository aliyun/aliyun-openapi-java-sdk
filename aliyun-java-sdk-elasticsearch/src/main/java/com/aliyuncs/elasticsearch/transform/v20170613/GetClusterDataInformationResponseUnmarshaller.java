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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.GetClusterDataInformationResponse;
import com.aliyuncs.elasticsearch.model.v20170613.GetClusterDataInformationResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.GetClusterDataInformationResponse.Result.MetaInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterDataInformationResponseUnmarshaller {

	public static GetClusterDataInformationResponse unmarshall(GetClusterDataInformationResponse getClusterDataInformationResponse, UnmarshallerContext _ctx) {
		
		getClusterDataInformationResponse.setRequestId(_ctx.stringValue("GetClusterDataInformationResponse.RequestId"));

		Result result = new Result();
		result.setConnectable(_ctx.booleanValue("GetClusterDataInformationResponse.Result.connectable"));

		MetaInfo metaInfo = new MetaInfo();
		metaInfo.setSettings(_ctx.stringValue("GetClusterDataInformationResponse.Result.metaInfo.settings"));
		metaInfo.setMapping(_ctx.stringValue("GetClusterDataInformationResponse.Result.metaInfo.mapping"));

		List<String> indices = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetClusterDataInformationResponse.Result.metaInfo.indices.Length"); i++) {
			indices.add(_ctx.stringValue("GetClusterDataInformationResponse.Result.metaInfo.indices["+ i +"]"));
		}
		metaInfo.setIndices(indices);

		List<String> fields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetClusterDataInformationResponse.Result.metaInfo.fields.Length"); i++) {
			fields.add(_ctx.stringValue("GetClusterDataInformationResponse.Result.metaInfo.fields["+ i +"]"));
		}
		metaInfo.setFields(fields);

		List<String> typeName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetClusterDataInformationResponse.Result.metaInfo.typeName.Length"); i++) {
			typeName.add(_ctx.stringValue("GetClusterDataInformationResponse.Result.metaInfo.typeName["+ i +"]"));
		}
		metaInfo.setTypeName(typeName);
		result.setMetaInfo(metaInfo);
		getClusterDataInformationResponse.setResult(result);
	 
	 	return getClusterDataInformationResponse;
	}
}
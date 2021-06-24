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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosisFeatureGraphResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertex;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDiagnosisFeatureGraphResponseUnmarshaller {

	public static OpsDescribeDiagnosisFeatureGraphResponse unmarshall(OpsDescribeDiagnosisFeatureGraphResponse opsDescribeDiagnosisFeatureGraphResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDiagnosisFeatureGraphResponse.setRequestId(_ctx.stringValue("OpsDescribeDiagnosisFeatureGraphResponse.RequestId"));
		opsDescribeDiagnosisFeatureGraphResponse.setTotalCount(_ctx.integerValue("OpsDescribeDiagnosisFeatureGraphResponse.TotalCount"));
		opsDescribeDiagnosisFeatureGraphResponse.setPageSize(_ctx.integerValue("OpsDescribeDiagnosisFeatureGraphResponse.PageSize"));
		opsDescribeDiagnosisFeatureGraphResponse.setPageNo(_ctx.integerValue("OpsDescribeDiagnosisFeatureGraphResponse.PageNo"));

		List<FeatureVertex> featureVertexs = new ArrayList<FeatureVertex>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertexs.Length"); i++) {
			FeatureVertex featureVertex = new FeatureVertex();
			featureVertex.setSeverityLevel(_ctx.stringValue("OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertexs["+ i +"].SeverityLevel"));
			featureVertex.setDetailDocId(_ctx.longValue("OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertexs["+ i +"].DetailDocId"));
			featureVertex.setFeatureType(_ctx.stringValue("OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertexs["+ i +"].FeatureType"));
			featureVertex.setFeatureTargetType(_ctx.stringValue("OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertexs["+ i +"].FeatureTargetType"));
			featureVertex.setDeleted(_ctx.booleanValue("OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertexs["+ i +"].Deleted"));
			featureVertex.setReason(_ctx.stringValue("OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertexs["+ i +"].Reason"));
			featureVertex.setId(_ctx.stringValue("OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertexs["+ i +"].Id"));
			featureVertex.setExecRule(_ctx.booleanValue("OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertexs["+ i +"].ExecRule"));
			featureVertex.setShortDesc(_ctx.stringValue("OpsDescribeDiagnosisFeatureGraphResponse.FeatureVertexs["+ i +"].ShortDesc"));

			featureVertexs.add(featureVertex);
		}
		opsDescribeDiagnosisFeatureGraphResponse.setFeatureVertexs(featureVertexs);
	 
	 	return opsDescribeDiagnosisFeatureGraphResponse;
	}
}
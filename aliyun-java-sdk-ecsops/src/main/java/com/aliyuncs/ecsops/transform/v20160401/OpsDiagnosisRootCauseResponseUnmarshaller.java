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

import com.aliyuncs.ecsops.model.v20160401.OpsDiagnosisRootCauseResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDiagnosisRootCauseResponse.RootCause;
import com.aliyuncs.ecsops.model.v20160401.OpsDiagnosisRootCauseResponse.RootCause.DerivationPath;
import com.aliyuncs.ecsops.model.v20160401.OpsDiagnosisRootCauseResponse.RootCause.DerivationPath.DerivationEdgeModel;
import com.aliyuncs.ecsops.model.v20160401.OpsDiagnosisRootCauseResponse.RootCause.FeatureData;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDiagnosisRootCauseResponseUnmarshaller {

	public static OpsDiagnosisRootCauseResponse unmarshall(OpsDiagnosisRootCauseResponse opsDiagnosisRootCauseResponse, UnmarshallerContext _ctx) {
		
		opsDiagnosisRootCauseResponse.setRequestId(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RequestId"));
		opsDiagnosisRootCauseResponse.setStatus(_ctx.stringValue("OpsDiagnosisRootCauseResponse.Status"));
		opsDiagnosisRootCauseResponse.setTaskId(_ctx.stringValue("OpsDiagnosisRootCauseResponse.TaskId"));

		List<RootCause> rootCauses = new ArrayList<RootCause>();
		for (int i = 0; i < _ctx.lengthValue("OpsDiagnosisRootCauseResponse.RootCauses.Length"); i++) {
			RootCause rootCause = new RootCause();
			rootCause.setSrcExceptionName(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].SrcExceptionName"));
			rootCause.setDimension(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].Dimension"));
			rootCause.setRootCauseDesc(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].RootCauseDesc"));
			rootCause.setAdditionalInfo(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].AdditionalInfo"));
			rootCause.setRelatedDetectId(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].RelatedDetectId"));
			rootCause.setFeatureName(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].FeatureName"));
			rootCause.setTargetId(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].TargetId"));
			rootCause.setExceptionTime(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].ExceptionTime"));
			rootCause.setReason(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].Reason"));

			List<String> supportTeams = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].SupportTeams.Length"); j++) {
				supportTeams.add(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].SupportTeams["+ j +"]"));
			}
			rootCause.setSupportTeams(supportTeams);

			List<DerivationPath> derivationPaths = new ArrayList<DerivationPath>();
			for (int j = 0; j < _ctx.lengthValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].DerivationPaths.Length"); j++) {
				DerivationPath derivationPath = new DerivationPath();
				derivationPath.setCoverage(_ctx.floatValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].DerivationPaths["+ j +"].Coverage"));
				derivationPath.setConfidence(_ctx.floatValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].DerivationPaths["+ j +"].Confidence"));

				List<DerivationEdgeModel> derivationEdgeModels = new ArrayList<DerivationEdgeModel>();
				for (int k = 0; k < _ctx.lengthValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].DerivationPaths["+ j +"].DerivationEdgeModels.Length"); k++) {
					DerivationEdgeModel derivationEdgeModel = new DerivationEdgeModel();
					derivationEdgeModel.setLogicalCorrelation(_ctx.floatValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].DerivationPaths["+ j +"].DerivationEdgeModels["+ k +"].LogicalCorrelation"));
					derivationEdgeModel.setSrcFeatureName(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].DerivationPaths["+ j +"].DerivationEdgeModels["+ k +"].SrcFeatureName"));
					derivationEdgeModel.setCorrelationByHuman(_ctx.floatValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].DerivationPaths["+ j +"].DerivationEdgeModels["+ k +"].CorrelationByHuman"));
					derivationEdgeModel.setDstFeatureName(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].DerivationPaths["+ j +"].DerivationEdgeModels["+ k +"].DstFeatureName"));

					derivationEdgeModels.add(derivationEdgeModel);
				}
				derivationPath.setDerivationEdgeModels(derivationEdgeModels);

				derivationPaths.add(derivationPath);
			}
			rootCause.setDerivationPaths(derivationPaths);

			List<FeatureData> featureDatas = new ArrayList<FeatureData>();
			for (int j = 0; j < _ctx.lengthValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].FeatureDatas.Length"); j++) {
				FeatureData featureData = new FeatureData();
				featureData.setLastMatchedTimestamp(_ctx.longValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].FeatureDatas["+ j +"].LastMatchedTimestamp"));
				featureData.setExtension(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].FeatureDatas["+ j +"].Extension"));
				featureData.setFirstMatchedTimestamp(_ctx.longValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].FeatureDatas["+ j +"].FirstMatchedTimestamp"));
				featureData.setFeatureName(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].FeatureDatas["+ j +"].FeatureName"));
				featureData.setMatchedTimes(_ctx.integerValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].FeatureDatas["+ j +"].MatchedTimes"));
				featureData.setSourceData(_ctx.stringValue("OpsDiagnosisRootCauseResponse.RootCauses["+ i +"].FeatureDatas["+ j +"].SourceData"));

				featureDatas.add(featureData);
			}
			rootCause.setFeatureDatas(featureDatas);

			rootCauses.add(rootCause);
		}
		opsDiagnosisRootCauseResponse.setRootCauses(rootCauses);
	 
	 	return opsDiagnosisRootCauseResponse;
	}
}
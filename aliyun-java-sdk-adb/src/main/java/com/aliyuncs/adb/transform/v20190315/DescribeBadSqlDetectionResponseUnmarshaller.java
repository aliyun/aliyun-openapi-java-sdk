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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeBadSqlDetectionResponse;
import com.aliyuncs.adb.model.v20190315.DescribeBadSqlDetectionResponse.OpenApiFasDetectionItem;
import com.aliyuncs.adb.model.v20190315.DescribeBadSqlDetectionResponse.OpenApiFasDetectionItem.BadSqlDiagnosisResult;
import com.aliyuncs.adb.model.v20190315.DescribeBadSqlDetectionResponse.OpenApiFasDetectionItem.BadSqlDiagnosisResult.BasicDiagnosisInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBadSqlDetectionResponseUnmarshaller {

	public static DescribeBadSqlDetectionResponse unmarshall(DescribeBadSqlDetectionResponse describeBadSqlDetectionResponse, UnmarshallerContext _ctx) {
		
		describeBadSqlDetectionResponse.setRequestId(_ctx.stringValue("DescribeBadSqlDetectionResponse.RequestId"));
		describeBadSqlDetectionResponse.setTotalCount(_ctx.stringValue("DescribeBadSqlDetectionResponse.TotalCount"));
		describeBadSqlDetectionResponse.setDBClusterId(_ctx.stringValue("DescribeBadSqlDetectionResponse.DBClusterId"));
		describeBadSqlDetectionResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeBadSqlDetectionResponse.AccessDeniedDetail"));

		List<OpenApiFasDetectionItem> detectionItems = new ArrayList<OpenApiFasDetectionItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBadSqlDetectionResponse.DetectionItems.Length"); i++) {
			OpenApiFasDetectionItem openApiFasDetectionItem = new OpenApiFasDetectionItem();
			openApiFasDetectionItem.setName(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Name"));
			openApiFasDetectionItem.setStatus(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Status"));
			openApiFasDetectionItem.setMessage(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Message"));

			List<BadSqlDiagnosisResult> results = new ArrayList<BadSqlDiagnosisResult>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results.Length"); j++) {
				BadSqlDiagnosisResult badSqlDiagnosisResult = new BadSqlDiagnosisResult();
				badSqlDiagnosisResult.setCost(_ctx.longValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].Cost"));
				badSqlDiagnosisResult.setPeakMemory(_ctx.longValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].PeakMemory"));
				badSqlDiagnosisResult.setOperatorCost(_ctx.longValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].OperatorCost"));
				badSqlDiagnosisResult.setScanSize(_ctx.longValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].ScanSize"));
				badSqlDiagnosisResult.setOutputDataSize(_ctx.longValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].OutputDataSize"));
				badSqlDiagnosisResult.setProcessId(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].ProcessId"));
				badSqlDiagnosisResult.setTotalStages(_ctx.integerValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].TotalStages"));
				badSqlDiagnosisResult.setSQL(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].SQL"));
				badSqlDiagnosisResult.setPatternId(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].PatternId"));
				badSqlDiagnosisResult.setStartTime(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].StartTime"));

				List<BasicDiagnosisInfo> diagnosisResults = new ArrayList<BasicDiagnosisInfo>();
				for (int k = 0; k < _ctx.lengthValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].DiagnosisResults.Length"); k++) {
					BasicDiagnosisInfo basicDiagnosisInfo = new BasicDiagnosisInfo();
					basicDiagnosisInfo.setCode(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].DiagnosisResults["+ k +"].Code"));
					basicDiagnosisInfo.setDetail(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].DiagnosisResults["+ k +"].Detail"));
					basicDiagnosisInfo.setStageId(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].DiagnosisResults["+ k +"].StageId"));
					basicDiagnosisInfo.setOperatorId(_ctx.stringValue("DescribeBadSqlDetectionResponse.DetectionItems["+ i +"].Results["+ j +"].DiagnosisResults["+ k +"].OperatorId"));

					diagnosisResults.add(basicDiagnosisInfo);
				}
				badSqlDiagnosisResult.setDiagnosisResults(diagnosisResults);

				results.add(badSqlDiagnosisResult);
			}
			openApiFasDetectionItem.setResults(results);

			detectionItems.add(openApiFasDetectionItem);
		}
		describeBadSqlDetectionResponse.setDetectionItems(detectionItems);
	 
	 	return describeBadSqlDetectionResponse;
	}
}
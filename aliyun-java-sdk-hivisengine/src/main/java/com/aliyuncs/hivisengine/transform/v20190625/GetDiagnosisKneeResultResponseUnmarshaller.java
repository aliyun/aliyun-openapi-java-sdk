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

package com.aliyuncs.hivisengine.transform.v20190625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hivisengine.model.v20190625.GetDiagnosisKneeResultResponse;
import com.aliyuncs.hivisengine.model.v20190625.GetDiagnosisKneeResultResponse.Data;
import com.aliyuncs.hivisengine.model.v20190625.GetDiagnosisKneeResultResponse.Data.FuncResult;
import com.aliyuncs.hivisengine.model.v20190625.GetDiagnosisKneeResultResponse.Data.FuncResult.StudyResult;
import com.aliyuncs.hivisengine.model.v20190625.GetDiagnosisKneeResultResponse.Data.FuncResult.StudyResult.SeriesResult;
import com.aliyuncs.hivisengine.model.v20190625.GetDiagnosisKneeResultResponse.Data.FuncResult.StudyResult.SeriesResult.InstanceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDiagnosisKneeResultResponseUnmarshaller {

	public static GetDiagnosisKneeResultResponse unmarshall(GetDiagnosisKneeResultResponse getDiagnosisKneeResultResponse, UnmarshallerContext _ctx) {
		
		getDiagnosisKneeResultResponse.setRequestId(_ctx.stringValue("GetDiagnosisKneeResultResponse.RequestId"));
		getDiagnosisKneeResultResponse.setCode(_ctx.stringValue("GetDiagnosisKneeResultResponse.Code"));
		getDiagnosisKneeResultResponse.setMessage(_ctx.stringValue("GetDiagnosisKneeResultResponse.Message"));

		Data data = new Data();
		data.setProcessStatus(_ctx.stringValue("GetDiagnosisKneeResultResponse.Data.ProcessStatus"));

		List<FuncResult> funcResults = new ArrayList<FuncResult>();
		for (int i = 0; i < _ctx.lengthValue("GetDiagnosisKneeResultResponse.Data.FuncResults.Length"); i++) {
			FuncResult funcResult = new FuncResult();
			funcResult.setStudyUid(_ctx.stringValue("GetDiagnosisKneeResultResponse.Data.FuncResults["+ i +"].StudyUid"));

			List<StudyResult> studyResults = new ArrayList<StudyResult>();
			for (int j = 0; j < _ctx.lengthValue("GetDiagnosisKneeResultResponse.Data.FuncResults["+ i +"].StudyResults.Length"); j++) {
				StudyResult studyResult = new StudyResult();
				studyResult.setSeriesUid(_ctx.stringValue("GetDiagnosisKneeResultResponse.Data.FuncResults["+ i +"].StudyResults["+ j +"].SeriesUid"));

				List<SeriesResult> seriesResults = new ArrayList<SeriesResult>();
				for (int k = 0; k < _ctx.lengthValue("GetDiagnosisKneeResultResponse.Data.FuncResults["+ i +"].StudyResults["+ j +"].SeriesResults.Length"); k++) {
					SeriesResult seriesResult = new SeriesResult();
					seriesResult.setInstanceUid(_ctx.stringValue("GetDiagnosisKneeResultResponse.Data.FuncResults["+ i +"].StudyResults["+ j +"].SeriesResults["+ k +"].InstanceUid"));

					List<InstanceResult> instanceResults = new ArrayList<InstanceResult>();
					for (int l = 0; l < _ctx.lengthValue("GetDiagnosisKneeResultResponse.Data.FuncResults["+ i +"].StudyResults["+ j +"].SeriesResults["+ k +"].InstanceResults.Length"); l++) {
						InstanceResult instanceResult = new InstanceResult();
						instanceResult.setClassLabel(_ctx.floatValue("GetDiagnosisKneeResultResponse.Data.FuncResults["+ i +"].StudyResults["+ j +"].SeriesResults["+ k +"].InstanceResults["+ l +"].ClassLabel"));
						instanceResult.setConfidence(_ctx.floatValue("GetDiagnosisKneeResultResponse.Data.FuncResults["+ i +"].StudyResults["+ j +"].SeriesResults["+ k +"].InstanceResults["+ l +"].Confidence"));

						List<String> box = new ArrayList<String>();
						for (int m = 0; m < _ctx.lengthValue("GetDiagnosisKneeResultResponse.Data.FuncResults["+ i +"].StudyResults["+ j +"].SeriesResults["+ k +"].InstanceResults["+ l +"].Box.Length"); m++) {
							box.add(_ctx.stringValue("GetDiagnosisKneeResultResponse.Data.FuncResults["+ i +"].StudyResults["+ j +"].SeriesResults["+ k +"].InstanceResults["+ l +"].Box["+ m +"]"));
						}
						instanceResult.setBox(box);

						instanceResults.add(instanceResult);
					}
					seriesResult.setInstanceResults(instanceResults);

					seriesResults.add(seriesResult);
				}
				studyResult.setSeriesResults(seriesResults);

				studyResults.add(studyResult);
			}
			funcResult.setStudyResults(studyResults);

			funcResults.add(funcResult);
		}
		data.setFuncResults(funcResults);
		getDiagnosisKneeResultResponse.setData(data);
	 
	 	return getDiagnosisKneeResultResponse;
	}
}
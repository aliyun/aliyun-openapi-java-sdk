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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.DescribeServiceDiagnosisResponse;
import com.aliyuncs.eas.model.v20210701.DescribeServiceDiagnosisResponse.Diagnosis;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceDiagnosisResponseUnmarshaller {

	public static DescribeServiceDiagnosisResponse unmarshall(DescribeServiceDiagnosisResponse describeServiceDiagnosisResponse, UnmarshallerContext _ctx) {
		
		describeServiceDiagnosisResponse.setRequestId(_ctx.stringValue("DescribeServiceDiagnosisResponse.RequestId"));

		List<Diagnosis> diagnosisList = new ArrayList<Diagnosis>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceDiagnosisResponse.DiagnosisList.Length"); i++) {
			Diagnosis diagnosis = new Diagnosis();
			diagnosis.setError(_ctx.stringValue("DescribeServiceDiagnosisResponse.DiagnosisList["+ i +"].Error"));

			List<String> causes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeServiceDiagnosisResponse.DiagnosisList["+ i +"].Causes.Length"); j++) {
				causes.add(_ctx.stringValue("DescribeServiceDiagnosisResponse.DiagnosisList["+ i +"].Causes["+ j +"]"));
			}
			diagnosis.setCauses(causes);

			List<String> advices = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeServiceDiagnosisResponse.DiagnosisList["+ i +"].Advices.Length"); j++) {
				advices.add(_ctx.stringValue("DescribeServiceDiagnosisResponse.DiagnosisList["+ i +"].Advices["+ j +"]"));
			}
			diagnosis.setAdvices(advices);

			diagnosisList.add(diagnosis);
		}
		describeServiceDiagnosisResponse.setDiagnosisList(diagnosisList);
	 
	 	return describeServiceDiagnosisResponse;
	}
}
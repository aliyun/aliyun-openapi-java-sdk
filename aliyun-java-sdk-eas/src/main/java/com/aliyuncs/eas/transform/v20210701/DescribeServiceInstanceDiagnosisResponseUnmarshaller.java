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

import com.aliyuncs.eas.model.v20210701.DescribeServiceInstanceDiagnosisResponse;
import com.aliyuncs.eas.model.v20210701.DescribeServiceInstanceDiagnosisResponse.Diagnosis;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceInstanceDiagnosisResponseUnmarshaller {

	public static DescribeServiceInstanceDiagnosisResponse unmarshall(DescribeServiceInstanceDiagnosisResponse describeServiceInstanceDiagnosisResponse, UnmarshallerContext _ctx) {
		
		describeServiceInstanceDiagnosisResponse.setRequestId(_ctx.stringValue("DescribeServiceInstanceDiagnosisResponse.RequestId"));

		Diagnosis diagnosis = new Diagnosis();
		diagnosis.setError(_ctx.stringValue("DescribeServiceInstanceDiagnosisResponse.Diagnosis.Error"));

		List<String> causes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceInstanceDiagnosisResponse.Diagnosis.Causes.Length"); i++) {
			causes.add(_ctx.stringValue("DescribeServiceInstanceDiagnosisResponse.Diagnosis.Causes["+ i +"]"));
		}
		diagnosis.setCauses(causes);

		List<String> advices = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceInstanceDiagnosisResponse.Diagnosis.Advices.Length"); i++) {
			advices.add(_ctx.stringValue("DescribeServiceInstanceDiagnosisResponse.Diagnosis.Advices["+ i +"]"));
		}
		diagnosis.setAdvices(advices);
		describeServiceInstanceDiagnosisResponse.setDiagnosis(diagnosis);
	 
	 	return describeServiceInstanceDiagnosisResponse;
	}
}
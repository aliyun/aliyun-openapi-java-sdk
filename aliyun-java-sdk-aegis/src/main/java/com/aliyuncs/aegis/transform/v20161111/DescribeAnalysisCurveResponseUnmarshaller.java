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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeAnalysisCurveResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeAnalysisCurveResponse.Curves;
import com.aliyuncs.aegis.model.v20161111.DescribeAnalysisCurveResponse.Curves.OriginalCurve;
import com.aliyuncs.aegis.model.v20161111.DescribeAnalysisCurveResponse.Curves.ResultCurve;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAnalysisCurveResponseUnmarshaller {

	public static DescribeAnalysisCurveResponse unmarshall(DescribeAnalysisCurveResponse describeAnalysisCurveResponse, UnmarshallerContext context) {
		
		describeAnalysisCurveResponse.setRequestId(context.stringValue("DescribeAnalysisCurveResponse.RequestId"));

		Curves curves = new Curves();

		List<OriginalCurve> originalCurveList = new ArrayList<OriginalCurve>();
		for (int i = 0; i < context.lengthValue("DescribeAnalysisCurveResponse.Curves.OriginalCurveList.Length"); i++) {
			OriginalCurve originalCurve = new OriginalCurve();
			originalCurve.setCount(context.integerValue("DescribeAnalysisCurveResponse.Curves.OriginalCurveList["+ i +"].Count"));
			originalCurve.setDsTimestamp(context.longValue("DescribeAnalysisCurveResponse.Curves.OriginalCurveList["+ i +"].DsTimestamp"));

			originalCurveList.add(originalCurve);
		}
		curves.setOriginalCurveList(originalCurveList);

		List<ResultCurve> resultCurveList = new ArrayList<ResultCurve>();
		for (int i = 0; i < context.lengthValue("DescribeAnalysisCurveResponse.Curves.ResultCurveList.Length"); i++) {
			ResultCurve resultCurve = new ResultCurve();
			resultCurve.setCount(context.integerValue("DescribeAnalysisCurveResponse.Curves.ResultCurveList["+ i +"].Count"));
			resultCurve.setDsTimestamp(context.longValue("DescribeAnalysisCurveResponse.Curves.ResultCurveList["+ i +"].DsTimestamp"));

			resultCurveList.add(resultCurve);
		}
		curves.setResultCurveList(resultCurveList);
		describeAnalysisCurveResponse.setCurves(curves);
	 
	 	return describeAnalysisCurveResponse;
	}
}
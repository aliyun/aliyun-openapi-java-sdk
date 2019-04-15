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

import com.aliyuncs.aegis.model.v20161111.DescribeDefenceThreadResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDefenceThreadResponseUnmarshaller {

	public static DescribeDefenceThreadResponse unmarshall(DescribeDefenceThreadResponse describeDefenceThreadResponse, UnmarshallerContext context) {
		
		describeDefenceThreadResponse.setRequestId(context.stringValue("DescribeDefenceThreadResponse.RequestId"));
		describeDefenceThreadResponse.setDefenceCountTotal(context.integerValue("DescribeDefenceThreadResponse.DefenceCountTotal"));
		describeDefenceThreadResponse.setTamperProofTotal(context.integerValue("DescribeDefenceThreadResponse.TamperProofTotal"));

		List<String> defenceAaggregatCountArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDefenceThreadResponse.DefenceAaggregatCountArray.Length"); i++) {
			defenceAaggregatCountArray.add(context.stringValue("DescribeDefenceThreadResponse.DefenceAaggregatCountArray["+ i +"]"));
		}
		describeDefenceThreadResponse.setDefenceAaggregatCountArray(defenceAaggregatCountArray);

		List<String> tamperProofArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDefenceThreadResponse.TamperProofArray.Length"); i++) {
			tamperProofArray.add(context.stringValue("DescribeDefenceThreadResponse.TamperProofArray["+ i +"]"));
		}
		describeDefenceThreadResponse.setTamperProofArray(tamperProofArray);

		List<String> dateArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDefenceThreadResponse.DateArray.Length"); i++) {
			dateArray.add(context.stringValue("DescribeDefenceThreadResponse.DateArray["+ i +"]"));
		}
		describeDefenceThreadResponse.setDateArray(dateArray);

		List<String> tamperProofAaggregateArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDefenceThreadResponse.TamperProofAaggregateArray.Length"); i++) {
			tamperProofAaggregateArray.add(context.stringValue("DescribeDefenceThreadResponse.TamperProofAaggregateArray["+ i +"]"));
		}
		describeDefenceThreadResponse.setTamperProofAaggregateArray(tamperProofAaggregateArray);

		List<String> defenceCountArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDefenceThreadResponse.DefenceCountArray.Length"); i++) {
			defenceCountArray.add(context.stringValue("DescribeDefenceThreadResponse.DefenceCountArray["+ i +"]"));
		}
		describeDefenceThreadResponse.setDefenceCountArray(defenceCountArray);
	 
	 	return describeDefenceThreadResponse;
	}
}
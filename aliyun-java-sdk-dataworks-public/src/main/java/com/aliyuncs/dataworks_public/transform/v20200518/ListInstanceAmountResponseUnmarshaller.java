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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListInstanceAmountResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListInstanceAmountResponse.IntanceCounts;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceAmountResponseUnmarshaller {

	public static ListInstanceAmountResponse unmarshall(ListInstanceAmountResponse listInstanceAmountResponse, UnmarshallerContext _ctx) {
		
		listInstanceAmountResponse.setRequestId(_ctx.stringValue("ListInstanceAmountResponse.RequestId"));

		List<IntanceCounts> instanceCounts = new ArrayList<IntanceCounts>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceAmountResponse.InstanceCounts.Length"); i++) {
			IntanceCounts intanceCounts = new IntanceCounts();
			intanceCounts.setDate(_ctx.longValue("ListInstanceAmountResponse.InstanceCounts["+ i +"].Date"));
			intanceCounts.setCount(_ctx.integerValue("ListInstanceAmountResponse.InstanceCounts["+ i +"].Count"));

			instanceCounts.add(intanceCounts);
		}
		listInstanceAmountResponse.setInstanceCounts(instanceCounts);
	 
	 	return listInstanceAmountResponse;
	}
}
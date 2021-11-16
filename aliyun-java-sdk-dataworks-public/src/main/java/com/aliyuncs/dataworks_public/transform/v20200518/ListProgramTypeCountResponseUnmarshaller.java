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

import com.aliyuncs.dataworks_public.model.v20200518.ListProgramTypeCountResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListProgramTypeCountResponse.ProgramTypeAndCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProgramTypeCountResponseUnmarshaller {

	public static ListProgramTypeCountResponse unmarshall(ListProgramTypeCountResponse listProgramTypeCountResponse, UnmarshallerContext _ctx) {
		
		listProgramTypeCountResponse.setRequestId(_ctx.stringValue("ListProgramTypeCountResponse.RequestId"));

		List<ProgramTypeAndCount> programTypeAndCounts = new ArrayList<ProgramTypeAndCount>();
		for (int i = 0; i < _ctx.lengthValue("ListProgramTypeCountResponse.ProgramTypeAndCounts.Length"); i++) {
			ProgramTypeAndCount programTypeAndCount = new ProgramTypeAndCount();
			programTypeAndCount.setProgramType(_ctx.stringValue("ListProgramTypeCountResponse.ProgramTypeAndCounts["+ i +"].ProgramType"));
			programTypeAndCount.setCount(_ctx.integerValue("ListProgramTypeCountResponse.ProgramTypeAndCounts["+ i +"].Count"));

			programTypeAndCounts.add(programTypeAndCount);
		}
		listProgramTypeCountResponse.setProgramTypeAndCounts(programTypeAndCounts);
	 
	 	return listProgramTypeCountResponse;
	}
}
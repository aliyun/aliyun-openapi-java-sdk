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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.CreateCasComputerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCasComputerResponseUnmarshaller {

	public static CreateCasComputerResponse unmarshall(CreateCasComputerResponse createCasComputerResponse, UnmarshallerContext _ctx) {
		
		createCasComputerResponse.setRequestId(_ctx.stringValue("CreateCasComputerResponse.RequestId"));
		createCasComputerResponse.setResultCode(_ctx.stringValue("CreateCasComputerResponse.ResultCode"));
		createCasComputerResponse.setResultMessage(_ctx.stringValue("CreateCasComputerResponse.ResultMessage"));

		List<String> computerSequences = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateCasComputerResponse.ComputerSequences.Length"); i++) {
			computerSequences.add(_ctx.stringValue("CreateCasComputerResponse.ComputerSequences["+ i +"]"));
		}
		createCasComputerResponse.setComputerSequences(computerSequences);
	 
	 	return createCasComputerResponse;
	}
}
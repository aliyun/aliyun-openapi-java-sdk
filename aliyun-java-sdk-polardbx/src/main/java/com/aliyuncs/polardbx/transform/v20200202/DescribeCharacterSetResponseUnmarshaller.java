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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeCharacterSetResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeCharacterSetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCharacterSetResponseUnmarshaller {

	public static DescribeCharacterSetResponse unmarshall(DescribeCharacterSetResponse describeCharacterSetResponse, UnmarshallerContext _ctx) {
		
		describeCharacterSetResponse.setRequestId(_ctx.stringValue("DescribeCharacterSetResponse.RequestId"));
		describeCharacterSetResponse.setSuccess(_ctx.booleanValue("DescribeCharacterSetResponse.Success"));
		describeCharacterSetResponse.setMessage(_ctx.stringValue("DescribeCharacterSetResponse.Message"));

		Data data = new Data();
		data.setEngine(_ctx.stringValue("DescribeCharacterSetResponse.Data.Engine"));

		List<String> characterSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCharacterSetResponse.Data.CharacterSet.Length"); i++) {
			characterSet.add(_ctx.stringValue("DescribeCharacterSetResponse.Data.CharacterSet["+ i +"]"));
		}
		data.setCharacterSet(characterSet);
		describeCharacterSetResponse.setData(data);
	 
	 	return describeCharacterSetResponse;
	}
}
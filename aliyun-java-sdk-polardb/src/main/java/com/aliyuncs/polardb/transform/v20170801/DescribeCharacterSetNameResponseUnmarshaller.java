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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeCharacterSetNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCharacterSetNameResponseUnmarshaller {

	public static DescribeCharacterSetNameResponse unmarshall(DescribeCharacterSetNameResponse describeCharacterSetNameResponse, UnmarshallerContext _ctx) {
		
		describeCharacterSetNameResponse.setRequestId(_ctx.stringValue("DescribeCharacterSetNameResponse.RequestId"));
		describeCharacterSetNameResponse.setEngine(_ctx.stringValue("DescribeCharacterSetNameResponse.Engine"));

		List<String> characterSetNameItems = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCharacterSetNameResponse.CharacterSetNameItems.Length"); i++) {
			characterSetNameItems.add(_ctx.stringValue("DescribeCharacterSetNameResponse.CharacterSetNameItems["+ i +"]"));
		}
		describeCharacterSetNameResponse.setCharacterSetNameItems(characterSetNameItems);
	 
	 	return describeCharacterSetNameResponse;
	}
}
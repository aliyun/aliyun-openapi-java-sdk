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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeCharacterSetNameResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCharacterSetNameResponseUnmarshaller {

	public static DescribeCharacterSetNameResponse unmarshall(DescribeCharacterSetNameResponse describeCharacterSetNameResponse, UnmarshallerContext context) {
		
		describeCharacterSetNameResponse.setRequestId(context.stringValue("DescribeCharacterSetNameResponse.RequestId"));
		describeCharacterSetNameResponse.setEngine(context.stringValue("DescribeCharacterSetNameResponse.Engine"));

		List<String> characterSetNameItems = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeCharacterSetNameResponse.CharacterSetNameItems.Length"); i++) {
			characterSetNameItems.add(context.stringValue("DescribeCharacterSetNameResponse.CharacterSetNameItems["+ i +"]"));
		}
		describeCharacterSetNameResponse.setCharacterSetNameItems(characterSetNameItems);
	 
	 	return describeCharacterSetNameResponse;
	}
}
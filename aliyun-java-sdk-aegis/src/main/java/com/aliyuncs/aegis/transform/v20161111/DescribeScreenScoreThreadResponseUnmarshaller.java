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

import com.aliyuncs.aegis.model.v20161111.DescribeScreenScoreThreadResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeScreenScoreThreadResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScreenScoreThreadResponseUnmarshaller {

	public static DescribeScreenScoreThreadResponse unmarshall(DescribeScreenScoreThreadResponse describeScreenScoreThreadResponse, UnmarshallerContext context) {
		
		describeScreenScoreThreadResponse.setRequestId(context.stringValue("DescribeScreenScoreThreadResponse.RequestId"));
		describeScreenScoreThreadResponse.setSuccess(context.booleanValue("DescribeScreenScoreThreadResponse.Success"));

		Data data = new Data();

		List<String> socreThreadDate = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenScoreThreadResponse.Data.SocreThreadDate.Length"); i++) {
			socreThreadDate.add(context.stringValue("DescribeScreenScoreThreadResponse.Data.SocreThreadDate["+ i +"]"));
		}
		data.setSocreThreadDate(socreThreadDate);

		List<String> socreThread = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenScoreThreadResponse.Data.SocreThread.Length"); i++) {
			socreThread.add(context.stringValue("DescribeScreenScoreThreadResponse.Data.SocreThread["+ i +"]"));
		}
		data.setSocreThread(socreThread);
		describeScreenScoreThreadResponse.setData(data);
	 
	 	return describeScreenScoreThreadResponse;
	}
}
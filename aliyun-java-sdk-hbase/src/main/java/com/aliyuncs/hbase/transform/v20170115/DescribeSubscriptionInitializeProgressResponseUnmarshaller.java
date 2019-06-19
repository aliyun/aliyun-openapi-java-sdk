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

package com.aliyuncs.hbase.transform.v20170115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20170115.DescribeSubscriptionInitializeProgressResponse;
import com.aliyuncs.hbase.model.v20170115.DescribeSubscriptionInitializeProgressResponse.InitializeProgress;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionInitializeProgressResponseUnmarshaller {

	public static DescribeSubscriptionInitializeProgressResponse unmarshall(DescribeSubscriptionInitializeProgressResponse describeSubscriptionInitializeProgressResponse, UnmarshallerContext context) {
		
		describeSubscriptionInitializeProgressResponse.setRequestId(context.stringValue("DescribeSubscriptionInitializeProgressResponse.RequestId"));
		describeSubscriptionInitializeProgressResponse.setPageNumber(context.integerValue("DescribeSubscriptionInitializeProgressResponse.PageNumber"));
		describeSubscriptionInitializeProgressResponse.setTotalRecordCount(context.integerValue("DescribeSubscriptionInitializeProgressResponse.TotalRecordCount"));
		describeSubscriptionInitializeProgressResponse.setPageRecordCount(context.integerValue("DescribeSubscriptionInitializeProgressResponse.PageRecordCount"));

		List<InitializeProgress> items = new ArrayList<InitializeProgress>();
		for (int i = 0; i < context.lengthValue("DescribeSubscriptionInitializeProgressResponse.Items.Length"); i++) {
			InitializeProgress initializeProgress = new InitializeProgress();
			initializeProgress.setSubscriptionId(context.stringValue("DescribeSubscriptionInitializeProgressResponse.Items["+ i +"].SubscriptionId"));
			initializeProgress.setStatus(context.stringValue("DescribeSubscriptionInitializeProgressResponse.Items["+ i +"].Status"));
			initializeProgress.setProgress(context.stringValue("DescribeSubscriptionInitializeProgressResponse.Items["+ i +"].Progress"));
			initializeProgress.setFinishTime(context.stringValue("DescribeSubscriptionInitializeProgressResponse.Items["+ i +"].FinishTime"));

			items.add(initializeProgress);
		}
		describeSubscriptionInitializeProgressResponse.setItems(items);
	 
	 	return describeSubscriptionInitializeProgressResponse;
	}
}
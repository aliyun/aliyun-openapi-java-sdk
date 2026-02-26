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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeIspFlushCacheTaskResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeIspFlushCacheTaskResponse.FlushCacheResult;
import com.aliyuncs.alidns.model.v20150109.DescribeIspFlushCacheTaskResponse.FlushCacheResult.DnsNode;
import com.aliyuncs.alidns.model.v20150109.DescribeIspFlushCacheTaskResponse.FlushCacheResult.DnsNode.Answer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIspFlushCacheTaskResponseUnmarshaller {

	public static DescribeIspFlushCacheTaskResponse unmarshall(DescribeIspFlushCacheTaskResponse describeIspFlushCacheTaskResponse, UnmarshallerContext _ctx) {
		
		describeIspFlushCacheTaskResponse.setRequestId(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.RequestId"));
		describeIspFlushCacheTaskResponse.setTaskId(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.TaskId"));
		describeIspFlushCacheTaskResponse.setDomainName(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.DomainName"));
		describeIspFlushCacheTaskResponse.setInstanceId(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.InstanceId"));
		describeIspFlushCacheTaskResponse.setInstanceName(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.InstanceName"));
		describeIspFlushCacheTaskResponse.setIsp(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.Isp"));
		describeIspFlushCacheTaskResponse.setTaskStatus(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.TaskStatus"));
		describeIspFlushCacheTaskResponse.setCreateTime(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.CreateTime"));
		describeIspFlushCacheTaskResponse.setCreateTimestamp(_ctx.longValue("DescribeIspFlushCacheTaskResponse.CreateTimestamp"));

		List<FlushCacheResult> flushCacheResults = new ArrayList<FlushCacheResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults.Length"); i++) {
			FlushCacheResult flushCacheResult = new FlushCacheResult();
			flushCacheResult.setProvince(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults["+ i +"].Province"));

			List<DnsNode> dnsNodes = new ArrayList<DnsNode>();
			for (int j = 0; j < _ctx.lengthValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults["+ i +"].DnsNodes.Length"); j++) {
				DnsNode dnsNode = new DnsNode();
				dnsNode.setNodeIp(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults["+ i +"].DnsNodes["+ j +"].NodeIp"));
				dnsNode.setSpName(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults["+ i +"].DnsNodes["+ j +"].SpName"));
				dnsNode.setStatus(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults["+ i +"].DnsNodes["+ j +"].Status"));

				List<Answer> answers = new ArrayList<Answer>();
				for (int k = 0; k < _ctx.lengthValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults["+ i +"].DnsNodes["+ j +"].Answers.Length"); k++) {
					Answer answer = new Answer();
					answer.setName(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults["+ i +"].DnsNodes["+ j +"].Answers["+ k +"].Name"));
					answer.setType(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults["+ i +"].DnsNodes["+ j +"].Answers["+ k +"].Type"));
					answer.setRecord(_ctx.stringValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults["+ i +"].DnsNodes["+ j +"].Answers["+ k +"].Record"));
					answer.setTtl(_ctx.longValue("DescribeIspFlushCacheTaskResponse.FlushCacheResults["+ i +"].DnsNodes["+ j +"].Answers["+ k +"].Ttl"));

					answers.add(answer);
				}
				dnsNode.setAnswers(answers);

				dnsNodes.add(dnsNode);
			}
			flushCacheResult.setDnsNodes(dnsNodes);

			flushCacheResults.add(flushCacheResult);
		}
		describeIspFlushCacheTaskResponse.setFlushCacheResults(flushCacheResults);
	 
	 	return describeIspFlushCacheTaskResponse;
	}
}
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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribePortConnsListResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribePortConnsListResponse.Conn;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortConnsListResponseUnmarshaller {

	public static DescribePortConnsListResponse unmarshall(DescribePortConnsListResponse describePortConnsListResponse, UnmarshallerContext _ctx) {
		
		describePortConnsListResponse.setRequestId(_ctx.stringValue("DescribePortConnsListResponse.RequestId"));

		List<Conn> connsList = new ArrayList<Conn>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortConnsListResponse.ConnsList.Length"); i++) {
			Conn conn = new Conn();
			conn.setConns(_ctx.longValue("DescribePortConnsListResponse.ConnsList["+ i +"].Conns"));
			conn.setActConns(_ctx.longValue("DescribePortConnsListResponse.ConnsList["+ i +"].ActConns"));
			conn.setInActConns(_ctx.longValue("DescribePortConnsListResponse.ConnsList["+ i +"].InActConns"));
			conn.setCps(_ctx.longValue("DescribePortConnsListResponse.ConnsList["+ i +"].Cps"));
			conn.setIndex(_ctx.longValue("DescribePortConnsListResponse.ConnsList["+ i +"].Index"));
			conn.setTime(_ctx.longValue("DescribePortConnsListResponse.ConnsList["+ i +"].Time"));

			connsList.add(conn);
		}
		describePortConnsListResponse.setConnsList(connsList);
	 
	 	return describePortConnsListResponse;
	}
}
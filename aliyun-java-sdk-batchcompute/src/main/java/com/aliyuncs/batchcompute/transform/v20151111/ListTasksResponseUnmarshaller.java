/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.ListTasksResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.MarkableResult;
import com.aliyuncs.batchcompute.pojo.v20151111.Task;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;


public class ListTasksResponseUnmarshaller {

	public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext context) throws ServerException {
		HttpResponse httpResponse = context.getHttpResponse();
		listTasksResponse.setHttpResponse(httpResponse);

		try {
			String body = new String(httpResponse.getHttpContent(), httpResponse.getEncoding());
			setContent(body, listTasksResponse);
		} catch (IOException e) {
			throw new ServerException("API.EncodeError", "encode response body error", listTasksResponse.getRequestId());
		}

		return listTasksResponse;
	}
	private static void setContent(String body, ListTasksResponse listTasksResponse) throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		MarkableResult<Task> result = mapper.readValue(body,
				new TypeReference<MarkableResult<Task>>() {
				});

		listTasksResponse.setItems(result.getItems());
		listTasksResponse.setNextMarker(result.getNextMarker());
	}
}
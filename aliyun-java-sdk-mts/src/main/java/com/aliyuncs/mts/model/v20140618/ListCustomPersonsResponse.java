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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.ListCustomPersonsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomPersonsResponse extends AcsResponse {

	private String requestId;

	private List<Category> categories;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public static class Category {

		private String categoryId;

		private String categoryName;

		private String categoryDescription;

		private List<Person> persons;

		public String getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCategoryDescription() {
			return this.categoryDescription;
		}

		public void setCategoryDescription(String categoryDescription) {
			this.categoryDescription = categoryDescription;
		}

		public List<Person> getPersons() {
			return this.persons;
		}

		public void setPersons(List<Person> persons) {
			this.persons = persons;
		}

		public static class Person {

			private String personName;

			private String personDescription;

			private String personId;

			private List<Face> faces;

			public String getPersonName() {
				return this.personName;
			}

			public void setPersonName(String personName) {
				this.personName = personName;
			}

			public String getPersonDescription() {
				return this.personDescription;
			}

			public void setPersonDescription(String personDescription) {
				this.personDescription = personDescription;
			}

			public String getPersonId() {
				return this.personId;
			}

			public void setPersonId(String personId) {
				this.personId = personId;
			}

			public List<Face> getFaces() {
				return this.faces;
			}

			public void setFaces(List<Face> faces) {
				this.faces = faces;
			}

			public static class Face {

				private String imageUrl;

				private String faceId;

				public String getImageUrl() {
					return this.imageUrl;
				}

				public void setImageUrl(String imageUrl) {
					this.imageUrl = imageUrl;
				}

				public String getFaceId() {
					return this.faceId;
				}

				public void setFaceId(String faceId) {
					this.faceId = faceId;
				}
			}
		}
	}

	@Override
	public ListCustomPersonsResponse getInstance(UnmarshallerContext context) {
		return	ListCustomPersonsResponseUnmarshaller.unmarshall(this, context);
	}
}

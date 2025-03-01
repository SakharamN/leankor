package helper_package;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;

public class CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper extends CommonMethodsOfWebDriver {

	public static String createFolderNameRandomly, createProjectNameRandomly, ActivityStartDateWhileCreating,
			getIframeWindowNameAttributeValue, handlevaluefokanbanBoardwindow, kanbanBoardwindowhandless;
	public static int sizeofSchedulemodeonactivity, sizeOfElementOnPG;
	public static int initialDividerBarPosition;
	public static String getIframeSRCAttribute, childIframevalue, textAreaIDAttribute,
			classAttributeValueOfQuickActionSideColumn;

	public void Create_SingleActivity() {

		try {
			Thread.sleep(8000);
		} catch (InterruptedException ie) {
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		String newTabTitle = driver.getTitle();
		System.out.println("New title of the tab is: " + newTabTitle);

		wait.until(ExpectedConditions.titleIs("Leankor | Salesforce"));

		try {
			Thread.sleep(8000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnFolderIcon()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnFolderIcon()).click();

		createFolderNameRandomly = generateRandomString(6);
		System.out.println("folder name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg class:: "+ createFolderNameRandomly);

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterFolderName()).sendKeys("A " + createFolderNameRandomly);
		explicitWaitElementToBeClickable(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddButton()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		scrollinToView(findElement(By.xpath("//*[text()='A " + createFolderNameRandomly + "']")));
		explicitWaitVisibilityOf(findElement(By.xpath("//*[text()='A " + createFolderNameRandomly + "']")));
		jsExecutorClickOnElement(findElement(By.xpath("//*[text()='A " + createFolderNameRandomly + "']")));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnThreeDots()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnThreeDots()).click();

		createProjectNameRandomly = generateRandomString(5);
		System.out.println(
				"Project name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg ::"
						+ createProjectNameRandomly);

		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddProject()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddProject()).click();

		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterProjectName()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterProjectName()).sendKeys(createProjectNameRandomly);

		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProjectAddButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProjectAddButton()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCreatedProject()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCreatedProject()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());

		driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframe()));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}
		int sizeOfElementOnPG = driver.findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.AddNewActivityButton()).size();
		System.out.println("Number of elements of sizeof elements :" + sizeOfElementOnPG);
		driver.findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.AddNewActivityButton()).get(sizeOfElementOnPG - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField()).sendKeys("Activity1");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);

		explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
	}

	public void quickActionsOnactivity() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// **************************Check Condition for Quick Action button is active
		// or inactive on activity side Column**************************

		explicitWaitElementBy("elementToBeLocated",CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.quickActionCheckCondition());
		classAttributeValueOfQuickActionSideColumn = findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.quickActionCheckCondition()).getDomAttribute("class");// above selenium 4.27 .getDomAttribute method replaced by
													// getDomAttribute or getDomProperty
		System.out.println("Class attribute value of quick action side column  :" + classAttributeValueOfQuickActionSideColumn);

		// Class attribute is x-menu-item-link means Quick Action icon is visible and
		// click on it
		// getDomAttribute("class");
		if (classAttributeValueOfQuickActionSideColumn.equals("x-menu-item-link")) {
			System.out.println("Quick Action button is active and perform change date operation.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}

			explicitWaitElementBy("elementToBeLocated",CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickQuickActionsOnActivity());
			findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickQuickActionsOnActivity()).click();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}
			explicitWaitElementBy("elementToBeLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnChangeDatequickActionsOnActivity());
			findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnChangeDatequickActionsOnActivity()).click();

			try {
				Thread.sleep(6000);
			} catch (InterruptedException ie) {
			}

			driver.switchTo().frame(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.iframeOnQuickActions()));

			boolean isChangeDateQuickActionWindowVisible = findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.isChangeDateWindowVisible()).isDisplayed();
			System.out.println("After click on change date quick action popup window opened :"+ isChangeDateQuickActionWindowVisible);

			if (isChangeDateQuickActionWindowVisible) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}

				explicitWaitElementBy("elementToBeLocated",CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.isStartDateCalendarVisibleUnderiFrame());
				boolean isStartDateFieldVisible = findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.isStartDateCalendarVisibleUnderiFrame()).isDisplayed();
				System.out.println("Start Date Field under iFrame is visible and now click on Due Date calendar."+ isStartDateFieldVisible);

				if (isStartDateFieldVisible) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ie) {
					}
					explicitWaitElementBy("elementToBeLocated",CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnQuickActionDueDateCalendarField());
					findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnQuickActionDueDateCalendarField()).click();

					explicitWaitElementBy("elementToBeLocated",CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.dueDateQuickActionCalendarAfterOnClick());
					boolean dueDateCalendarQuickAction = findElement(
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.dueDateQuickActionCalendarAfterOnClick()).isDisplayed();
					System.out.println("dueDateCalendarQuickAction  :" + dueDateCalendarQuickAction);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException ie) {
					}
					scrollDown();

					try {
						Thread.sleep(1000);
					} catch (InterruptedException ie) {
					}
					explicitWaitElementBy("elementToBeLocated",
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getSelectedDateFromQuickActionDueDateCalendar());
					String getSelectedDateFromQuickActionDueDateCalendar = findElement(
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getSelectedDateFromQuickActionDueDateCalendar()).getText();
					System.out.println("getSelectedDateFromQuickActionDueDateCalendar :"
							+ getSelectedDateFromQuickActionDueDateCalendar + " is selected date currently.");

					explicitWaitElementBy("elementToBeLocated",
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getSelectedDateFromQuickActionDueDateCalendar());
					String getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar = findElement(
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getSelectedDateFromQuickActionDueDateCalendar()).getDomAttribute("aria-selected");
					System.out.println(
							"getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar under Quick action Due Date calendar :"
									+ getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar);

					explicitWaitElementBy("elementToBeLocated",
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getAllRowElementsOfSelectDate());
					int getSizeOfAllRowElementsOfSelectDate = findElements(
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getAllRowElementsOfSelectDate()).size();
					System.out.println("getSizeOfAllRowElementsOfSelectDate under Quick action Due Date calendar :"
							+ getSizeOfAllRowElementsOfSelectDate);

					for (int i = 1; i <= getSizeOfAllRowElementsOfSelectDate; i++) {
						String classAttributeValueOfTdElement = findElement(
								By.xpath("//td[@aria-selected='true']/parent::tr/child::td[" + i + "]"))
										.getDomAttribute("aria-selected");
						System.out.println("classAttributeValueOfTdElement  after " + i + " iteration :"
								+ classAttributeValueOfTdElement);

						if (getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar
								.equals(classAttributeValueOfTdElement) && i <= 5) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException ie) {
							}
							findElement(By.xpath("//td[@aria-selected='true']/parent::tr/child::td[" + (i + 2) + "]"))
									.click();
							try {
								Thread.sleep(1000);
							} catch (InterruptedException ie) {
							}
							explicitWaitElementBy("elementToBeLocated",
									CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
											.clickOnSaveButtonAfterDateSelectedOnQuickAction());
							findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.clickOnSaveButtonAfterDateSelectedOnQuickAction()).click();
							break;
						} else if (getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar
								.equals(classAttributeValueOfTdElement) && i >= 6) {
							try {
								Thread.sleep(1500);
							} catch (InterruptedException ie) {
							}
							explicitWaitElementBy("elementToBeLocated",
									CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
											.selectDateFromQuickActionCalendarOnNextRow());
							findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.selectDateFromQuickActionCalendarOnNextRow()).click();
							try {
								Thread.sleep(2000);
							} catch (InterruptedException ie) {
							}
							explicitWaitElementBy("elementToBeLocated",
									CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
											.clickOnSaveButtonAfterDateSelectedOnQuickAction());
							findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.clickOnSaveButtonAfterDateSelectedOnQuickAction()).click();
							break;
						}
					}
				}
			}
		}

		else

		{
			// perform random click on Plan Gantt Board

			/*
			 * try { robot = new Robot(); } catch(AWTException awtExc) {}
			 * 
			 * try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			 * robot.mouseMove(500, 500); actions.click().build().perform();
			 * 
			 */

			try {
				Thread.sleep(1500);
			} catch (InterruptedException ie) {
			}

			explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
			findElement(By.xpath("//body")).click();

		}
		System.out.println(
				"***********************************************************************************************************************************************************************************************************");

	}

	public void addButtonfunctionality() {

		// perform add button functionality on Activity

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}
		driver.switchTo().parentFrame();

		// Add activity above

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity())
				.click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityAbove()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityAbove()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("ActivityAbove");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);

		// Add activity below

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity())
				.click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityBelow()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityBelow()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("ActivityBelow");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);

		// Add milestone

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity())
				.click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addMilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addMilestone()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("milestone1");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);

		// Add activity group

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity())
				.click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityGroup()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityGroup()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("ActivityGroup1");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);
		System.out.println("We  perform add button functionality on Activity :"
				+ "\n**************************************************************************************************************************************************************************************************");

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

	}

	public void clickOnDiscussTabOnActivity() {

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity())
				.click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnDiscussColumn()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnDiscussColumn()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.loadMaskCountForKanbanBoard());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectiframe());

		getIframeSRCAttribute = findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectiframe())
						.getDomAttribute("src");
		System.out.println("src :" + getIframeSRCAttribute);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		driver.switchTo().frame(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.iFrameSrcValueAndSwitchToframe()));

		handleElementClickInterceptedExpectionWhileClickOnElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnPostLink());

		boolean PostWindowclickElementvisible = findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnPostWriteSomething())
						.isDisplayed();
		System.out.println("PostClick element is displayed :" + PostWindowclickElementvisible);

		// explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnPostWriteSomething()));
		// findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnPostWriteSomething()).click();

		// handleElementClickInterceptedExpectionWhileClickOnElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnPostWriteSomething());

		if (PostWindowclickElementvisible) {
			explicitWaitElementBy("elementToBeLocated",
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectchildirframe());
			childIframevalue = findElement(
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectchildirframe())
							.getDomAttribute("class");
			System.out.println("childIframe class attribute value :" + childIframevalue);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}
			driver.switchTo().frame(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
					.getChildiFrameClassAttributeValue()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}
			explicitWaitElementBy("elementToBeLocated",
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.ClickOnchatterTextarea());
			findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.ClickOnchatterTextarea())
					.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
			}

			boolean chatterArea = findElement(
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.writeOnChatterTextArea())
							.isDisplayed();
			System.out.println("chatter area is visible :" + chatterArea);

			if (chatterArea) {
				explicitWaitVisibilityOf(findElement(
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.writeOnChatterTextArea()));
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.writeOnChatterTextArea())
						.sendKeys("Hello this chatter on activity on plan gantt Board");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}
				driver.switchTo().parentFrame();

				explicitWaitVisibilityOf(findElement(
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.ClickOnshareButton()));
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.ClickOnshareButton())
						.click();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}
				explicitWaitElementBy("elementToBeLocated",
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.textDivArea());
				textAreaIDAttribute = findElement(
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.textDivArea())
								.getDomAttribute("id");
				System.out.println("Plan Gantt Board Chatter text Area ID Attribute :" + textAreaIDAttribute);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}

				// explicitWaitElementBy("elementToBeLocated",
				// CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.getTextFromChatterSubWindowofActivity());
				// String chatterText =
				// findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.getTextFromChatterSubWindowofActivity()).getText();
				// System.out.println("After Chatter get text from chatter sub window
				// :"+chatterText+"\n**************************************************************************************************************************************************************************************************");
				// try {Thread.sleep(1000);}catch(InterruptedException ie) {}

				// driver.switchTo().defaultContent();

				driver.switchTo().parentFrame();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}
				explicitWaitElementBy("elementToBeLocated",
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
								.closeKanbanBoardChatterPopup());
				findElement(
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.closeKanbanBoardChatterPopup())
								.click();

			}

		}

	}

	public void convertToActivityGroup() {

		// converting activity to activity group
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity())
				.click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.convertToActivityGroup()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.convertToActivityGroup()).click();
		System.out.println("Activity is Converted into Activity Group");

	}

	public void performIndentOutdentOperatisOnActivity() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// Perform Indent Operation

		// Clicking on the activity below three dot for Indent operation
		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnIndent()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnIndent()).click();

		// Check if the saving changes spinner is displayed
		boolean isSavingChangesDisplayed = findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.loadSpinnerForSavingChanges())
						.isDisplayed();
		System.out
				.println("After clicking on Indent, saving changes message is displayed: " + isSavingChangesDisplayed);

		if (isSavingChangesDisplayed) {
			System.out.println("Indent operation performed successfully as the saving changes message is displayed.");
		} else {
			System.out.println("Indent operation might have failed as the saving changes message is not displayed.");
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// Perform Outdent Operation

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnOutdent()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnOutdent()).click();

		// Check if the saving changes spinner is displayed after clicking on Outdent

		boolean isSavingChangesDisplayedAfterclickOnOutdent = findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.loadSpinnerForSavingChanges())
						.isDisplayed();
		System.out.println("After clicking on Outdent, saving changes message is displayed: "
				+ isSavingChangesDisplayedAfterclickOnOutdent);

		if (isSavingChangesDisplayedAfterclickOnOutdent) {
			System.out.println("Outdent operation performed successfully as the saving changes message is displayed.");
		} else {
			System.out.println("Outdent operation might have failed as the saving changes message is not displayed.");
		}

	}

	// clicking on clone option

	public void cloneActivity() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// count the total number of activities before cloned operation

		// get the initial count of activities
		int initialCount = findElements(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.activityList())
				.size();
		System.out.println("Total Numbers of activities in table before cloned operation is ;" + initialCount);

		// Wait for the cloned activity to appear
		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCloneOptions()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCloneOptions()).click();
		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.Loadmaskloader());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}

		// Get the updated count of activities

		int updatedCount = findElements(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.activityList())
				.size();
		System.out.println("Total Numbers of activities in table after performed cloned operation is ;" + updatedCount);

		// Validate if the activity count increased by one
		if (updatedCount == initialCount + 1) {
			System.out.println("Clone operation successful. Activity count increased by one.");
		} else {
			System.out.println(
					"Clone operation failed. Activity count did not change.+\n**************************************************************************************************************************************************************************************************");
		}

	}

	public void deleteOperation_OnActivity() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		// count the total number of activities before delete operation

		// get the initial count of activities
		int initialCount = findElements(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.activityList())
				.size();
		System.out.println("Total Numbers of activities in table before delete Operation is ;" + initialCount);

		// perform delete opertaion on activity
		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()).click();

		explicitWaitVisibilityOf(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnMilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnMilestone()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectNoOptions()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectNoOptions()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()).click();

		explicitWaitVisibilityOf(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnMilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnMilestone()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectYesOptions()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectYesOptions()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deletingLoadmask());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}

		// Get the updated count of activities

		int updatedCount = findElements(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.activityList())
				.size();
		System.out.println("Total Numbers of activities in table after performed delete Operation is ;" + updatedCount);

		// Validate if the activity count increased by one

		if (updatedCount == initialCount - 1) {
			System.out.println("delete operation successful. Activity count decreased by one.");
		} else {
			System.out.println("delete operation failed. Activity count did not change.");
		}
		System.out.println(
				"**********************************************************************************************************************************************************************");

	}

	// check external dependency button functionality on Activity

	public void performExternalDependancyOperationOnActivity() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnmilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnmilestone()).click();

		// click on external dependency
		explicitWaitVisibilityOf(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnExternalDependency()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnExternalDependency())
				.click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException ie) {
		}

		// switch to the new tab
		ArrayList<String> alltabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(alltabs.get(1));

		// Waiting for loading mask to disappear
		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.Loadmaskloader());

		/*
		 * // Waiting for the milestone highlighting element to become visible
		 * explicitWaitElementBy("elementToBeLocated",
		 * CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.
		 * milestoneHighlighting());
		 * 
		 * // check if milestone is highlighted boolean isMilestoneHighlighted =
		 * findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.
		 * milestoneHighlighting()).isDisplayed();
		 * 
		 * if(isMilestoneHighlighted) { System.out.
		 * println("After clicking on external dependency and switching to the new tab, the activity is highlighted with a red flash: "
		 * + isMilestoneHighlighted); } else { System.out.
		 * println("After clicking on external dependency and switching to the new tab, the activity is not highlighted."
		 * ); }
		 */

		try {
			explicitWaitVisibilityOf(
					findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.plusIconforPDG()));

			// Wait for the milestoneHighlighting element to be visible
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement milestoneHighlighting = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[@class='x-grid-item-container']//img[contains(@class,'highlight-task-cls')]")));

			// Confirm if the element is visible
			if (milestoneHighlighting.isDisplayed()) {
				System.out.println(
						"After clicking on external dependency on milestonethen milestone hightlighted with red flash: MilestoneHighlighting element is visible .");
			}
		} catch (NoSuchElementException ne) {
			System.err.println("NoSuchElementException: MilestoneHighlighting element is not present in the DOM.");
		} catch (Exception e) {
			System.err.println("An unexpected error occurred: " + e.getMessage());
		}

		System.out.println(
				"************************************************************************************************************************************************************************");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}
		// Switch back to the original tab
		Set<String> windows = driver.getWindowHandles();

		driver.switchTo().window(alltabs.get(0));
		// Switch to the parent iframe
		driver.switchTo().frame(
				driver.findElement(By.xpath("//div[@class='iframe-parent slds-template_iframe slds-card']/iframe")));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// switchToiFrame("boardIfram");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='boardIfram']")));

	}

}